package demo5_2;


public class MapHashNaif {
	
	private static final int TAILLE_TABLE = 20;
	
	private String[] cles = new String[TAILLE_TABLE];
	private Object[] valeurs = new Object[TAILLE_TABLE];
	private int taille = 0;
    
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        

        
        return builder.toString();
    }

	public void put(String cle, Object valeur) {
		int indice = cle.length();
		cles[indice] = cle;
		valeurs[indice] = valeur;

	}


	public Object get(String cle) {
		int indice = cle.length();
		return valeurs[indice];

	}

    
    
    
}
