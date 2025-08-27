package demo1_2;

public abstract class Personnage implements Combattant {
    private final String nom;
    private int pointsDeVie;

    protected Personnage(String nom, int pointsDeVie) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void subirDegats(int degats) {
        pointsDeVie -= degats;
        System.out.println(nom + " subit " + degats + " dégâts. PV restants : " + pointsDeVie);
    }

    // Chaque sous-classe devra préciser sa manière d'attaquer et défendre
    @Override
    public abstract void attaquer();

    @Override
    public abstract void defendre();
}