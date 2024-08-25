public class App {
    public static void main(String[] args) {
        Vehicule maVoiture = new Voiture("Toyota");
        VehiculeMotorise maMoto = new Moto("Harley-Davidson");
        
        // maVoiture.demarrer();
        maVoiture.afficherType();
        // maVoiture.arreter(); 

        maMoto.demarrer();
        // maMoto.afficherType();
        ((Vehicule)maMoto).afficherType();
        maMoto.arreter();
    }
}
