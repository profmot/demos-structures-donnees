package demo5_1;

import java.util.ArrayList;
import java.util.List;

public class MapNaifGr4 {

    
    private List<String> cles = new ArrayList<>();
    private List<Object> valeurs = new ArrayList<>();
    
    
    public void put(String cle, Object valeur) {
        if(containsKey(cle)) {
            
            int indiceCleValeur = cles.indexOf(cle);
            valeurs.set(indiceCleValeur, valeur);
            
        }else {
            
            cles.add(cle);
            valeurs.add(valeur);
        }
        
        
    
    }
    
    public boolean containsKey(String cle) {
        return cles.indexOf(cle) >= 0;
    }
    

    public Object get(String cle) {
        Object valeur = null;
        
        int indiceCleValeur = cles.indexOf(cle);
        
        if(indiceCleValeur >= 0) {
            
            valeur = valeurs.get(indiceCleValeur);
        }
        
        return valeur;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("{");

        if(cles.size() > 0) {
            formaterPaire(builder, 0);
        }
        
        for(int i = 1; i < cles.size(); i++) {
            builder.append(", ");
            formaterPaire(builder, i);  
        }
        
        builder.append("}");

        
        return builder.toString();
    }
    
    private void formaterPaire(StringBuilder builder,
                               int indice){
        
        String cle = cles.get(indice);
        Object valeur = valeurs.get(indice);
        
        builder.append(cle);
        builder.append(":");
        builder.append(valeur);
    }
    
    
    
}
