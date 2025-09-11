package demo5_1;

import java.util.ArrayList;
import java.util.List;

public class MapNaif {
	
	private List<String> cles = new ArrayList<>();
	private List<Object> valeurs =  new ArrayList<>();

	

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

	public Object get(String cle)  {
		return null;
	}

	public int size() {
		return cles.size();
		//return valeurs.size();
	}



    
    
    
}
