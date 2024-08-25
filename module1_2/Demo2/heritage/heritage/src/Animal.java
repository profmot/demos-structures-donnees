class Animal {
    // Méthode héritée : aucune redéfinition nécessaire
    void manger() {
        System.out.println("Cet animal mange.");
    }

    // Méthode à redéfinir dans la sous-classe
    void faireDuBruit() {
        System.out.println("Cet animal fait du bruit.");
    }
}