package demo5_1;

import java.util.ArrayList;
import java.util.List;

public class MapNaifGr1 {
	
	private List<String> cles = new ArrayList<>();
	private List<Object> valeurs = new ArrayList<>();

	public void put(String cle, Object valeur) {
		
		int indicePaire = cles.indexOf(cle);
		
		if(indicePaire == -1) {

			cles.add(cle);
			valeurs.add(valeur);

		}else {
			
			cles.set(indicePaire, cle);
			valeurs.set(indicePaire, valeur);
			
		}
		
	}

	public Object get(String cle) {
		int indicePaire = cles.indexOf(cle);
		
		return valeurs.get(indicePaire);
	}
    
    
    
    private boolean siCleExisteDeja(String cle) {
    	return cles.indexOf(cle) != -1;
	}



	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        

        
        return builder.toString();
    }




    
    
    
}
