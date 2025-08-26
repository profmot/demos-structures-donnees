package demo1_2;

public class Guerrier extends Personnage {
    public Guerrier(String nom) {
        super(nom, 120); // Guerrier : plus robuste
    }

    @Override
    public void attaquer() {
        System.out.println(getNom() + " attaque avec son épée !");
    }

    @Override
    public void defendre() {
        System.out.println(getNom() + " bloque avec son bouclier !");
    }
}
