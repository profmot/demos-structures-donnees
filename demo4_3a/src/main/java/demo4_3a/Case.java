package demo4_3a;

public class Case<T> {

	private T       valeur  = null;
	private Case<T> suivant = null;

	public Case(T valeur) {
		this.valeur = valeur;
	}

	public void setSuivant(Case<T> suivant) {
		this.suivant = suivant;
	}

	public boolean suivantExiste() {
		return suivant != null;
	}

	public Case<T> getSuivant() {
		return suivant;
	}
}
