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
		// Interface  ... new Implantation
		// Liste      ... new MaListe
		// Arbre      ... new MonArbre
		
		
		Map<String, Object> maRacine = new NtroHashMap();
		this.racine = maRacine;
		
		List<Object> items = new ArrayList<>();
		
		GardeRobe gardeRobe = new GardeRobe();
		
		Map<String, Object> chapeau01 = new NtroHashMap<>();

		Map<String, Object> chapeau02 = new NtroHashMap<>();
		
		this.racine = maRacine;
		
		this.racine.put("gardeRobe", gardeRobe);
		
		items.add(chapeau01);
		items.add(chapeau02);
		
		gardeRobe.setContient(items);
		
	}

}








