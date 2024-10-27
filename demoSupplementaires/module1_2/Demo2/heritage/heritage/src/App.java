public class App {
    public static void main(String[] args) {
        Chien monChien = new Chien();
        
        // Appel de la méthode héritée (aucune redéfinition nécessaire)
        monChien.manger(); // Affiche: Cet animal mange.

        // Appel de la méthode redéfinie
        monChien.faireDuBruit(); // Affiche: Le chien aboie.

        // Appel de la nouvelle méthode spécifique à la classe Chien
        monChien.secouerLaQueue(); // Affiche: Le chien secoue la queue.
    }
}
