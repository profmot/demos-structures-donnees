package demo3_1.etape0;

public class MonAthleteSoccer extends MonAthlete implements AthleteSoccer {
	
	private int nombreCartons;

	public MonAthleteSoccer(String nom, int nombreDeCartons) {
		super(nom);
		this.nombreCartons = nombreDeCartons;
	}

	@Override
	public int nombreCartons() {
		return nombreCartons;
	}

}
