package demo4_3;

public class Element {
	
	private char valeur;
	private Element suivant;
	private Element precedent;

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

	public Element getPrecedent() {
		return precedent;
	}

	public void setPrecedent(Element precedent) {
		this.precedent = precedent;
	}
	
	



}
