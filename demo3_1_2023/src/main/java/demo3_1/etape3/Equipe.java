package demo3_1.etape3;

public interface Equipe<A extends Athlete<A>> {
	
	void ajouterAthlete(A athelete);

	A plusUtile();

}
