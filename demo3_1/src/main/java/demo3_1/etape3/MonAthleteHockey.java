package demo3_1.etape3;

public class MonAthleteHockey extends MonAthlete<AthleteHockey> implements AthleteHockey {
	
	private int minutesPenalite;

	public MonAthleteHockey(String nom, int minutesPenalite) {
		super(nom);
		this.minutesPenalite = minutesPenalite;
	}

	@Override
	public int minutesPenalite() {
		return minutesPenalite;
	}

	@Override
	public int compareTo(AthleteHockey autre) {
		// -1 si this < autre
		// 0 si this.equals(autre)
		// +1 si this > autre
		int resultat = 0;
		
		if(minutesPenalite < autre.minutesPenalite()) {

			resultat = -1;
			
		}else if(minutesPenalite > autre.minutesPenalite()){
			
			resultat = +1;
			
		}else {
			
			resultat = 0;
			
			
		}
	
		
		
		
		return resultat;
	}

}
