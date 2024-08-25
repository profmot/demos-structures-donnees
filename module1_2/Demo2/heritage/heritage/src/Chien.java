class Chien extends Animal {
    // Méthode héritée : manger() est héritée telle quelle de Animal

    // Méthode redéfinie : redéfinition de la méthode faireDuBruit()
    @Override
    void faireDuBruit() {
        System.out.println("Le chien aboie.");
    }

    // Nouvelle méthode : spécifique à la classe Chien
    void secouerLaQueue() {
        System.out.println("Le chien secoue la queue.");
    }
}
