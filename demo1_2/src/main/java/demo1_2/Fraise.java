package demo1_2;

public class Fraise extends PetitFruit {

	public Fraise(double poidsEnGramme) {
		super(poidsEnGramme);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String nom() {
		return "Fraise";
	}

	@Override
	protected String couleur() {
		return "rouge";
	}
	
	// 🍓
	
	@Override
	public String toString() {
		return super.toString() + "(fraise)";
	}

}
