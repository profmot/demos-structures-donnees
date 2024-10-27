package demo1_2;
@SuppressWarnings("unused")
public class BanqueEnLigne extends Banque {
            
    private String url;

    public BanqueEnLigne(String nom, int nombreClients, String url) {
        super(nom , nombreClients);

        this.url = url;

    }

    @Override
    public int nombreDeClients() {


        return  super.nombreDeClients() / 2;
    }

    @Override
    protected String typeDeBanque() {
        return "banque en ligne";
    }


}
