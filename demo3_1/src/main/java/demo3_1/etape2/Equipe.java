package demo3_1.etape2;

public interface Equipe<A extends Athlete> {
	
	void ajouterAthlete(A athelete);

	A plusUtile();

}
