package demo3_1.etape2;

import java.util.ArrayList;
import java.util.List;

public class MonEquipe<A extends Athlete> implements Equipe<A> {
	
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

			if(plusUtile instanceof AthleteHockey) {

				AthleteHockey courantHockey = (AthleteHockey) courant;
				AthleteHockey plusUtileHockey = (AthleteHockey) plusUtile;
				
				if(courantHockey.minutesPenalite() < plusUtileHockey.minutesPenalite()) {
					plusUtile = (A) courantHockey;
				}
				
			}else if(plusUtile instanceof AthleteSoccer) {
				AthleteSoccer courantSoccer = (AthleteSoccer) courant;
				AthleteSoccer plusUtileSoccer = (AthleteSoccer) plusUtile;
				
				if(courantSoccer.nombreCartons() < plusUtileSoccer.nombreCartons()) {
					plusUtile = (A) courantSoccer;
				}
			}
		}

		return plusUtile;
	}

}
