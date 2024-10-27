package demo5_1;

import java.util.ArrayList;
import java.util.List;

public class MapNaifGr2 {
	
	private List<String> cles = new ArrayList<>();
	private List<Object> valeurs = new ArrayList<>();

	public void put(String cle, Object valeur) {
		if(cles.contains(cle)){
			
			int indiceCle = cles.indexOf(cle);
			valeurs.set(indiceCle, valeur);
			
			
		}else {
			
			cles.add(cle);
			valeurs.add(valeur);
			
		}

	}
	

	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        

        
        return builder.toString();
    }


	public int size() {
		return cles.size();
	}





    
    
    
}
