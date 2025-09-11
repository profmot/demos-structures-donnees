package demo5_1;

import java.util.ArrayList;
import java.util.List;

public class MapNaifGr1 {
	
	private List<String> cles = new ArrayList<>();
	private List<Object> valeurs = new ArrayList<>();

	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return builder.toString();
    }

	public void put(String cle, Object valeur)  {
		int indiceCle = cles.indexOf(cle);
		
		if(indiceCle != -1) {
			
			valeurs.set(indiceCle, valeur);
			
		}else {
			

			cles.add(cle);
			valeurs.add(valeur);
			
		}


	}

	// cle == "cle04"
	public Object get(String cle)  {
		Object valeur = null;

		int indiceCle = cles.indexOf(cle);
		
		if(indiceCle != -1) {
			valeur = valeurs.get(indiceCle);
		}

		return valeur;
	}

	public int size() {
		return 0;
	}



    
    
    
}
