package demo3_1.etape2;

import demo3_1.validateur.Modele;

public class Etape2 extends Modele<Etape2> {
	
	private Equipe equipe;
	
	@Override 
	public void initialize() {
		equipe = new MonEquipe();
		
		equipe.ajouterAthlete(new MonAthlete("Walid"));
		equipe.ajouterAthlete(new MonAthlete("Rosa"));
		equipe.ajouterAthlete(new MonAthlete("Robson"));
		equipe.ajouterAthlete(new MonAthlete("Lili"));
		
		System.out.println("plusUtile?: " + equipe.plusUtile());
		
		EquipeHockey equipeHockey = new MonEquipeHockey();
		equipeHockey.ajouterAthlete(new MonAthleteHockey("Bob", 120));
		equipeHockey.ajouterAthlete(new MonAthleteHockey("Lise", 2));
		//equipeHockey.ajouterAthlete(new MonAthleteSoccer("Lili", 3));
		System.out.println("plusUtile? (hockey): " + equipeHockey.plusUtile());
		
		EquipeSoccer equipeSoccer = new MonEquipeSoccer();
		equipeSoccer.ajouterAthlete(new MonAthleteSoccer("Roland", 40));
		equipeSoccer.ajouterAthlete(new MonAthleteSoccer("Jeff", 1));
		//equipeSoccer.ajouterAthlete(new MonAthleteHockey("Lili", 0));
		System.out.println("plusUtile? (soccer): " + equipeSoccer.plusUtile());
	}
	
	
	public static void main(String[] args) {
		new Etape2().initialize();
	}

}
