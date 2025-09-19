package demo2_3;

public class MonCalculateur extends Calculateur {

    public MonCalculateur(int n) {
        super(n);
    }

    @Override
    public void calculerFactoriel() {
        tete = new MonFactoriel(n);
        tete.calculerReponse();
    }
}
