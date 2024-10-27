package demo1_2;

public class BanqueTrad extends Banque{

    public BanqueTrad(String nom, int nombreClients) {
        super(nom, nombreClients);
    }

    @Override
    protected String typeDeBanque() {
        return "Banque traditionnelle";
    }

}
