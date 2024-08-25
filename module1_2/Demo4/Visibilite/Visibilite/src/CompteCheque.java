class CompteCheque extends CompteBancaire {
    private double limiteDecouvert;

    public CompteCheque(double soldeInitial, double limiteDecouvert) {
        super(soldeInitial);
        this.limiteDecouvert = limiteDecouvert;
    }

    @Override
    public void retirer(double montant) {
        if (montant <= 0 || (getSolde() - montant < -limiteDecouvert)) {
            throw new IllegalArgumentException("Montant invalide ou limite de découvert dépassée.");
        }
        super.retirer(montant);
    }
}
