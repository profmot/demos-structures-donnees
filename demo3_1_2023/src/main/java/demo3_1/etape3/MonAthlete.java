package demo3_1.etape3;


public abstract class MonAthlete<A extends Athlete<A>> implements Athlete<A> {

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
