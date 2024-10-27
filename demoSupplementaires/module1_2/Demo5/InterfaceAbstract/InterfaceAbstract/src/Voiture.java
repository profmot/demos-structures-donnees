class Voiture extends Vehicule implements VehiculeMotorise {
    public Voiture(String marque) {
        super(marque);
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("La voiture s'arrête.");
    }

    @Override
    void afficherType() {
        System.out.println("Je suis une voiture de marque " + getMarque() + ".");
    }
}


