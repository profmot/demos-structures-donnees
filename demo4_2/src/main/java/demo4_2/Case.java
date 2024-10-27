package demo4_2;

public class Case {
	
	private char valeur;
	private Case prochaineCase;

	public Case(char c) {
		this.valeur = c;
	}

	public char getValeur() {
		return valeur;
	}

	public void setValeur(char valeur) {
		this.valeur = valeur;
	}

	public Case getProchaineCase() {
		return prochaineCase;
	}

	public void setProchaineCase(Case prochaineCase) {
		this.prochaineCase = prochaineCase;
	}
	
	
	
	

}
