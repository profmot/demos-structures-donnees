package demo4_3a;

public class Conteneur {
	
	private Object valeur;
	private Conteneur suivant;
	

	public Conteneur(char c) {
		this.valeur = c;
	}

	public Object getValeur() {
		return valeur;
	}

	public void setValeur(Object valeur) {
		this.valeur = valeur;
	}

	public Conteneur getSuivant() {
		return suivant;
	}

	public void setSuivant(Conteneur suivant) {
		this.suivant = suivant;
	}
	
	
		
	

}
