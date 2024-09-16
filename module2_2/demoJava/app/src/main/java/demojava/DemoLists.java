package demojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLists {
    public String testLists() {
        List<String> liste = Arrays.asList("Alice", "Bob");
        liste.add("allo");

        List<String> listeChaines = new ArrayList<>();    
        List<Double> listeNombres = new ArrayList<>();    
        List<Object> listeJson = new ArrayList<>();       

        listeChaines.add("ab"); 
        //listeChaines.add(12);   ERREUR
        listeChaines.add("cd"); 

        listeChaines.add(1,"bc");     
        listeChaines.set(2,"bb");     

        listeNombres.add(3.6);     
        listeNombres.add(0.4);   
       // listeNombres.add(false); ERRUER

        if(listeNombres.contains(3.6)){
            listeNombres.remove(3.6);      

        }

        listeJson.add("ab");   // 13
        listeJson.add(3.6);    // 14
        listeJson.add(null);   // 15

        listeJson.clear();                     // 16

        return "tout est beau!";
    }
}
