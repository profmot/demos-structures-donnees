package demo1_2;

public abstract class Fruit {
	
	private double poidsEnGrammes = 0;


	public double getPoidsEnGrammes() {
		return poidsEnGrammes;
	}

	public void setPoidsEnGrammes(double poidsEnGrammes) {
		this.poidsEnGrammes = poidsEnGrammes;
	}
	
	public Fruit(double poidsEnGramme) {
		setPoidsEnGrammes(poidsEnGramme);
	}
	
	@Override
	public String toString() {
		return nom() + " (" + poidsEnGrammes + " grammes), qui est " + couleur();
	}
	
	protected abstract String nom();

	protected abstract String couleur();
	
	

}
