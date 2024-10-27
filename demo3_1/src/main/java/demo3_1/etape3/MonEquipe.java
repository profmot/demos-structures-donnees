package demo3_1.etape3;

import java.util.ArrayList;
import java.util.List;

public abstract class MonEquipe<A extends Athlete<A>> implements Equipe<A> {
	
	private List<A> athletes = new ArrayList<>();

	@Override
	public void ajouterAthlete(A athelete) {
		this.athletes.add(athelete);
	}

	@Override
	public A plusUtile() {
		A plusUtile = null;
		
		if(athletes.size() > 0) {
			plusUtile = athletes.get(0);
		}
		
		for(int i = 0; i < athletes.size(); i++) {
			A courant = athletes.get(i);
			
			if(courant.compareTo(plusUtile) < 0) {

				plusUtile = courant;
			}
		}

		return plusUtile;
	}

}
