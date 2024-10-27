package demo3_1.etape0;

public class MonAthleteHockey extends MonAthlete implements AthleteHockey {
	
	private int minutesPenalite;

	public MonAthleteHockey(String nom, int minutesPenalite) {
		super(nom);
		this.minutesPenalite = minutesPenalite;
	}

	@Override
	public int minutesPenalite() {
		return minutesPenalite;
	}
}
