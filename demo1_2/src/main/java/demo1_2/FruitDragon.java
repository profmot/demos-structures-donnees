package demo1_2;

public class FruitDragon extends FruitExotique {

	public FruitDragon(double poidsEnGramme) {
		super(poidsEnGramme);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String nom() {
		return "Fruit du dragon";
	}

	@Override
	protected String couleur() {
		return "rouge";
	}

}
