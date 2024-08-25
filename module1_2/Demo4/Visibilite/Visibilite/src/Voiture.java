class Voiture {
    private String marque;
    private String modele;
    private int vitesseMax;
    protected int vitesseActuelle;
    public boolean moteurAllume;

    public Voiture(String marque, String modele, int vitesseMax) {
        this.marque = marque;
        this.modele = modele;
        this.vitesseMax = vitesseMax;
        this.vitesseActuelle = 0;
        this.moteurAllume = false;
    }

    // Méthode publique pour démarrer le moteur
    public void demarrerMoteur() {
        if (verifierSystemes()) { // Appel à la méthode privée
            moteurAllume = true;
            System.out.println("Le moteur est allumé.");
        } else {
            System.out.println("Erreur: Vérification des systèmes échouée. Le moteur ne peut pas être démarré.");
        }
    }

    // Méthode privée pour vérifier les systèmes de la voiture
    private boolean verifierSystemes() {
        // Implémentation de la vérification des différents systèmes
        System.out.println("Vérification des systèmes en cours...");
        
        boolean etatDesFreins = true; 
        boolean niveauHuileCorrect = true; 
        boolean pressionPneusOK = true; 

        if (etatDesFreins && niveauHuileCorrect && pressionPneusOK) {
            return true; 
        } else {
            return false; 
        }
    }

    public void augmenterVitesse(int increment) {
        if (moteurAllume && (vitesseActuelle + increment <= vitesseMax)) {
            vitesseActuelle += increment;
            System.out.println("Vitesse actuelle : " + vitesseActuelle + " km/h");
        }
    }

    public void afficherInfos() {
        System.out.println("Marque: " + marque + ", Modèle: " + modele + ", Vitesse maximale: " + vitesseMax + " km/h");
    }
}
