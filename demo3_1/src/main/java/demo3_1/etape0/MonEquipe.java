package demo3_1.etape0;

import java.util.ArrayList;
import java.util.List;

public class MonEquipe implements Equipe {
	
	private List<Object> athletes = new ArrayList<>();

	@Override
	public void ajouterAthlete(Object athelete) {
		this.athletes.add(athelete);
	}

	@Override
	public Object plusUtile() {
		Object plusUtile = null;
		
		if(athletes.size() > 0) {
			plusUtile = athletes.get(0);
		}
		
		for(int i = 0; i < athletes.size(); i++) {
			Object courant = athletes.get(i);
			
			if(plusUtile instanceof AthleteHockey
					&& courant instanceof AthleteHockey) {

				AthleteHockey courantHockey = (AthleteHockey) courant;
				AthleteHockey plusUtileHockey = (AthleteHockey) plusUtile;
				
				if(courantHockey.minutesPenalite() < plusUtileHockey.minutesPenalite()) {
					plusUtile = courantHockey;
				}
				
			}else if(plusUtile instanceof AthleteSoccer
					&& courant instanceof AthleteSoccer) {

				AthleteSoccer courantSoccer = (AthleteSoccer) courant;
				AthleteSoccer plusUtileSoccer = (AthleteSoccer) plusUtile;
				
				if(courantSoccer.nombreCartons() < plusUtileSoccer.nombreCartons()) {
					plusUtile = courantSoccer;
				}
			}
		}
		
		return plusUtile;
	}

}
