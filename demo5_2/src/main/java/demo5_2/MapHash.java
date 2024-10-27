package demo5_2;


public class MapHash {
	
	private static final int TAILLE_TABLE = 20;
	
	private MapNaif[] table = new MapNaif[TAILLE_TABLE];
	private int taille = 0;
    
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        

        
        return builder.toString();
    }

	public void put(String cle, Object valeur) {
		int indiceCle = hachage(cle);
		
		MapNaif mapNaif = table[indiceCle];
		
		if(mapNaif == null) {
			
			mapNaif = new MapNaif();
			table[indiceCle] = mapNaif;
			
		}
		
		if(!mapNaif.containsKey(cle)) {
			taille++;
		}
		
		mapNaif.put(cle, valeur);
		
	}

	private int hachageMauvais(String cle) {
		return 0;
	}

	private int hachageMoyen(String cle) {
		return cle.length();
	}

	public Object get(String cle) {
		
		Object resultat = null;
		
		int indiceCle = hachage(cle);
		
		MapNaif maiNaif = table[indiceCle];
		
		if(maiNaif != null) {
			
			resultat = maiNaif.get(cle);
			
		}
		
		return resultat;

	}

	private int hachage(String cle) {
		int indice = 0;
		
		if(cle != null && cle.length() > 0) {
			
			for(int i = 0; i < cle.length(); i++) {
				indice += cle.charAt(i);
			}

			indice = indice % TAILLE_TABLE;
		}

		return indice;
	}

    
    
    
}
