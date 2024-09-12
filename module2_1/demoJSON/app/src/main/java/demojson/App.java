/*
 * This source file was generated by the Gradle 'init' task
 */
package demojson;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {

        // List<String> liste = Arrays.asList("Alice", "Bob");
        // liste.add("allo");


        Personne personne = new Personne("Alice", 25);
        Gson gson = new Gson();
        
        // Conversion de l'objet Personne en JSON
        String json = gson.toJson(personne);
        System.out.println("Objet Java en JSON: " + json);

        //---------------deserialisation
        json = "{\"nom\":\"Alice\",\"age\":25}";
        // Conversion du JSON en objet Personne
        personne = gson.fromJson(json, Personne.class);
        System.out.println("Nom: " + personne.getNom() + ", Âge: " + personne.getAge());
    
    }
}
