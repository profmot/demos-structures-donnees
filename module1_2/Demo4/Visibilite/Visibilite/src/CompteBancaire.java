class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        if (soldeInitial < 0) {
            throw new IllegalArgumentException("Le solde initial ne peut pas être négatif.");
        }
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être positif.");
        }
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= 0 || montant > solde) {
            throw new IllegalArgumentException("Montant invalide ou fonds insuffisants.");
        }
        solde -= montant;
    }
}

