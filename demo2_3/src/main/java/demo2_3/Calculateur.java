package demo2_3;

public abstract class Calculateur {

    protected int n;
    protected Factoriel tete;

    public Calculateur(int n) {
        this.n = n;
    }

    public abstract void calculerFactoriel();

    public long getResultat() {
        if (tete == null)
            throw new IllegalStateException("Calcul non effectué.");
        return tete.getReponse();
    }
}
