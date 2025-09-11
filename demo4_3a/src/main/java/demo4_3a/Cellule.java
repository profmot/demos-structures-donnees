package demo4_3a;

public class Cellule {
	
	private char valeur;
	private Cellule prochain;

	public Cellule(char valeur) {
		this.valeur = valeur;
	}

	public void setProchain(Cellule prochain) {
		this.prochain = prochain;
	}

	public boolean prochainExiste() {
		return prochain != null;
	}

	public Cellule getProchain() {
		return prochain;
	}

}
