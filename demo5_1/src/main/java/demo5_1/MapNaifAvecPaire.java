package demo5_1;

import java.util.ArrayList;
import java.util.List;

public class MapNaifAvecPaire {
	
	private List<PairePourMap<String,Object>> memoire = new ArrayList<>();

	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return builder.toString();
    }

	public void put(String cle, Object valeur)  {
		int indicePaire = memoire.indexOf(new PairePourMap<String, Object>(cle, null));
		
		if(indicePaire != -1) {
			
			memoire.get(indicePaire).valeur = valeur;
			
		}else {
			memoire.add(new PairePourMap<String, Object>(cle, valeur));
		}

	}

	public Object get(String cle)  {
		return null;

	}

	public int size() {
		return 0;
	}



    
    
    
}
