package demo5_2;


public class MapHashGererCollisions {
	
	private static final int TAILLE_TABLE = 20;
	
	private MapNaif[] table = new MapNaif[TAILLE_TABLE];
    
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        

        
        return builder.toString();
    }

	public void put(String cle, Object valeur) {
		int indiceCle = indiceCle(cle);
		
		MapNaif mapNaif = table[indiceCle];
		
		if(mapNaif == null) {
			mapNaif = new MapNaif();
			table[indiceCle] = mapNaif;
		}
		
		mapNaif.put(cle, valeur);
	}
	
	private int indiceCle(String cle) {
		int indice = 0;
		
		if(cle != null && cle.length() > 0) {
			String premiereLettre = cle.substring(0,1);
			premiereLettre = premiereLettre.toLowerCase();
			indice = premiereLettre.charAt(0);
			
			indice = indice % TAILLE_TABLE;
		}

		return indice;
	}
    
    
    
}
