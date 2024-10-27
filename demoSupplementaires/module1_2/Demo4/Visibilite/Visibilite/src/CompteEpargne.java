class CompteEpargne extends CompteBancaire {
    private double tauxInteret; // Taux d'intérêt en pourcentage

    public CompteEpargne(double soldeInitial, double tauxInteret) {
        super(soldeInitial);
        if (tauxInteret < 0) {
            throw new IllegalArgumentException("Le taux d'intérêt ne peut pas être négatif.");
        }
        this.tauxInteret = tauxInteret;
    }

    public void ajouterInteret() {
        double interet = getSolde() * tauxInteret / 100;
        deposer(interet);
    }
}
