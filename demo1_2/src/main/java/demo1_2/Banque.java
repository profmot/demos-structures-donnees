package demo1_2;

import java.io.PrintStream;

@SuppressWarnings("unused")
public abstract class Banque implements Affichable{

    
    private String nom;
    private int nombreClientsEnMillions;

    public Banque(String nom, int nombreClients) {
        this.nom  = nom;
        this.nombreClientsEnMillions = nombreClients;
    }

    public int nombreDeClients() {
        return this.nombreClientsEnMillions * 1000000;
    }

    
    public void afficher(PrintStream out) {

        out.println("banque de type " + typeDeBanque() + " avec " + nombreDeClients() + " clients");
    }

    protected abstract String typeDeBanque();

}
