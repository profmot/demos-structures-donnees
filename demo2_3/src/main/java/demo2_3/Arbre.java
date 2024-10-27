package demo2_3;

import java.util.Date;
import java.util.Random;

import demo2_3.validateur.Modele;


public class Arbre extends Modele<Arbre> {
	
	private static Random alea = new Random(new Date().getTime());
	
	private Noeud racine = new Noeud();

	@Override
	public void initialize() {
		
		Noeud noeud01 = new Noeud();
		Noeud noeud02 = new Noeud();
		
		racine.ajouterEnfant(noeud01);
		racine.ajouterEnfant(noeud02);
		
		Noeud curseur = racine;

		for(int i = 0; i < 5; i++) {
			Noeud nouvelEnfant = new Noeud();
			curseur.ajouterEnfant(nouvelEnfant);

			if(alea.nextInt(10) > 3) {
				curseur = nouvelEnfant;
			}
		}
		
		System.out.println(racine.profondeur());
		
	}
	
	public static void main(String[] args) {
		new Arbre().initialize();
	}

}








