class Moto extends Vehicule implements VehiculeMotorise {
    public Moto(String marque) {
        super(marque);
    }

    @Override
    public void demarrer() {
        System.out.println("La moto démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("La moto s'arrête.");
    }

    @Override
    void afficherType() {
        System.out.println("Je suis une moto de marque " + getMarque() + ".");
    }
}