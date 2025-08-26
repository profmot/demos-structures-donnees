package demo1_2;

public class Mage extends Personnage {
    public Mage(String nom) {
        super(nom, 80); // Mage : moins de PV
    }

    @Override
    public void attaquer() {
        System.out.println(getNom() + " lance une boule de feu !");
    }

    @Override
    public void defendre() {
        System.out.println(getNom() + " se protège avec un sort magique !");
    }
}
