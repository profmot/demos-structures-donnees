package demo3_1.etape0;


public class MonAthlete implements Athlete {

	private String nom;
	
	public MonAthlete(String nom) {
		this.nom = nom;
	}

	@Override
	public String nom() {
		return nom;
	}
	
	@Override 
	public String toString() {
		return nom;
	}
}
