package demo3_1;

import java.util.List;

// définir/créer un paramètre de types
public class Equipe<J extends Joueur> {
	
	private List<J> joueurs;

	
	public void ajouterJoueur(J joueur) {
		joueurs.add(joueur);
	}

	public J premierJoueur() {
		J premierJoueur = null;
		
		if(joueurs.size() > 0) {
			premierJoueur = joueurs.get(0);
		}
		
		return premierJoueur;

		
		

	}
}
