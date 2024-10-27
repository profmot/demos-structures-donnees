public class App {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Toyota", "Corolla", 180);
        maVoiture.demarrerMoteur();
        maVoiture.augmenterVitesse(50);
        maVoiture.afficherInfos();

        // maVoiture.marque = "Ford"; // Erreur : marque a une visibilité private
        // maVoiture.vitesseActuelle = 60; // Erreur : vitesseActuelle a une visibilité protected
    
    
        CompteEpargne epargne = new CompteEpargne(1000, 2.5);
        epargne.ajouterInteret();
        System.out.println("Solde après intérêts: " + epargne.getSolde());

        CompteCheque cheque = new CompteCheque(500, 200);
        try {
            cheque.retirer(700);
            System.out.println("Retrait réussi. Nouveau solde: " + cheque.getSolde());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    
    
    }


}
