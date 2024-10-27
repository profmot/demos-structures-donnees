package demojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoLists {
    public String testLists() {
        List<String> liste = new ArrayList<>();
        liste.add("Bob");
        liste.add("Lucie");
        liste.add("Allo");

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
        listeJson.add(new DemoLists());
        listeChaines.add(new DemoLists());

        listeJson.clear();                     // 16

        //utilisation d'un iterator
        List<String> fruits = Arrays.asList("Pomme", "Banane", "Orange");
        Iterator<String> it = fruits.iterator();

        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
        }

        // utilisation de foreach
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        return "tout est beau!";
    }
}
