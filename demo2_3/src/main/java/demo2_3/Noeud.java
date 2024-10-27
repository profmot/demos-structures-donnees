package demo2_3;

import java.util.Arrays;

public class Noeud {
	
	private Noeud[] enfants = new Noeud[0];
	
	public void ajouterEnfant(Noeud nouvelEnfant) {
		enfants = Arrays.copyOf(enfants, enfants.length + 1);
		enfants[enfants.length -1 ] = nouvelEnfant;
	}
	
	
	public int profondeur() {
		int resultat = 0;
		
		for(Noeud enfant : enfants) {
			int profondeurCetteBranche = enfant.profondeur() + 1;
			
			if(profondeurCetteBranche > resultat) {
				resultat = profondeurCetteBranche;
			}
		}
		
		return resultat;
	}

}
