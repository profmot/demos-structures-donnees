package demo2_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import demo2_2.validateur.Modele;

@SuppressWarnings("serial")

public class MesDonneesJava extends Modele<MesDonneesJava> {

	public enum Couleur {
		ROUGE, VERT, BLEU
	}

	private Map<String, Object> racine;

	public Map<String, Object> getRacine() {
		return racine;
	}

	public void setRacine(Map<String, Object> racine) {
		this.racine = racine;
	}

	@Override
	public void initialize() {

		Map<String, Object> maRacine = new HashMap<>();
		GardeRobe maGardeRobe = new GardeRobe();
		maGardeRobe.emplacement = "chambre";

		List<Object> monContenu = new ArrayList<>();
		Map<String, Object> chapeau1 = new HashMap<>();
		chapeau1.put("chaud", false);
		chapeau1.put("contenudans", maGardeRobe);
		chapeau1.put("type", "Paille");
		chapeau1.put("tailleRebord", 12.45);

		Map<String, Object> chapeau2 = new HashMap<>();
		chapeau2.put("chaud", false);
		chapeau2.put("contenudans", maGardeRobe);
		chapeau2.put("type", "Tuque");
		// chapeau2.get("contenudans");
		monContenu.add(chapeau1);
		monContenu.add(chapeau2);

		maRacine.put("gardeRobe", maGardeRobe);
		maGardeRobe.contient = monContenu;
		this.setRacine(maRacine);

	}

}
