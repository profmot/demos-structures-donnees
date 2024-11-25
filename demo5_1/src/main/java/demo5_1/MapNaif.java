package demo5_1;

import java.util.ArrayList;
import java.util.List;

public class MapNaif<K,V> {
	
	private List<K> cles = new ArrayList<>();
    private List<V> valeurs = new ArrayList<>();
    
    public void put(K cle, V valeur){
        int indice = cles.indexOf(cle);

        if (indice>-1){
            valeurs.set(indice, valeur);
        } else{
            cles.add(cle);
            valeurs.add(valeur);
        }
    }

    public int size(){
        return cles.size();
    }
    
    
}
