package demo4_3a;

public class Element {
	
	private char valeur;
	private Element suivant;

	public Element(char c) {
		setValeur(c);
	}

	public char getValeur() {
		return valeur;
	}

	public void setValeur(char valeur) {
		this.valeur = valeur;
	}

	public Element getSuivant() {
		return suivant;
	}

	public void setSuivant(Element suivant) {
		this.suivant = suivant;
	}
	
	
	
	



}
