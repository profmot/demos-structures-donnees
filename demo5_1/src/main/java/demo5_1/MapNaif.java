package demo5_1;

import java.util.ArrayList;
import java.util.List;

public class MapNaif {
	
	private List<String> cles = new ArrayList<>();
	private List<Object> valeurs = new ArrayList<>();
	

	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        

        
        return builder.toString();
    }

	public void put(String cle, Object valeur)  {
		int indicePaire = cles.indexOf(cle);
		
		if(indicePaire >= 0) {

			valeurs.set(indicePaire, valeur);
			
		}else {
			
			cles.add(cle);
			valeurs.add(valeur);
			
		}
		
		

	}

	public Object get(String cle)  {
		Object resultat = null;

		int indicePaire = cles.indexOf(cle);
		
		if(indicePaire >= 0) {

			resultat = valeurs.get(indicePaire);
		}
		
		return resultat;
		
	}

	public int size() {
		return cles.size();
	}





    
    
    
}
