package demo2_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import demo2_2.validateur.Modele;

@SuppressWarnings("serial")

public class MesDonneesJava extends Modele<MesDonneesJava> {

	private Map<String, Object> racine;

	public Map<String, Object> getRacine() {
		return racine;
	}

	public void setRacine(Map<String, Object> racine) {
		this.racine = racine;
	}

	@Override
	public void initialize() {

		Map<String, Object> maRacine = new NtroHashMap();

	}

}
