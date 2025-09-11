package demo3_1.etape3;

public class MonAthleteSoccer extends MonAthlete<AthleteSoccer> implements AthleteSoccer {
	
	private int nombreCartons;

	public MonAthleteSoccer(String nom, int nombreDeCartons) {
		super(nom);
		this.nombreCartons = nombreDeCartons;
	}

	@Override
	public int nombreCartons() {
		return nombreCartons;
	}

	@Override
	public int compareTo(AthleteSoccer autre) {
		// -1 si this < autre
		// 0 si this.equals(autre)
		// +1 si this > autre
		int resultat = 0;
		
		if(nombreCartons < autre.nombreCartons()) {

			resultat = -1;

		}else if(nombreCartons > autre.nombreCartons()) {

			resultat = +1;

		}else {

			resultat = 0;
		}

		return resultat;
	}

}
