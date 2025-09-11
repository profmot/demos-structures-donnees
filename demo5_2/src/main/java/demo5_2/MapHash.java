package demo5_2;


public class MapHash {
	
	private static final int TAILLE_TABLE = 20;
	
	private MapNaif[] petitsMaps = new MapNaif[TAILLE_TABLE];
	private int taille = 0;
    
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        

        
        return builder.toString();
    }

	public void put(String cle, Object valeur) {
		int indice = hachageBon(cle);
		MapNaif petitMap = petitsMaps[indice];
		if(petitMap == null) {
			petitMap = new MapNaif();
			petitsMaps[indice] = petitMap;
		}

		petitMap.put(cle, valeur);
	}


	public Object get(String cle) {
		Object valeur = null;

		int indice = hachageMoyen2(cle);

		MapNaif petitMap = petitsMaps[indice];
		if(petitMap != null) {
			valeur = petitMap.get(cle);
		}
		
		return valeur;

	}

	private int hachageBon(String cle) {
		int indice = 0;
		
		for(int i = 0; i < cle.length(); i++) {
			indice += cle.charAt(i);
		}
		
		indice = indice % TAILLE_TABLE;
		return indice;
	}

	private int hachageMoyen2(String cle) {
		int indice = cle.charAt(0) % TAILLE_TABLE;
		return indice;
	}

	private int hachageMoyen(String cle) {
		int indice = cle.length();
		return indice;
	}

	private int hachageMauvais(String cle) {
		return 0;
	}

    
    
    
}
