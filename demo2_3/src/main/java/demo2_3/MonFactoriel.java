package demo2_3;

public class MonFactoriel implements Factoriel {

    private int n;
    private long reponse;
    private MonFactoriel moinsUn; // lien récursif (graphe d'objets)

    public MonFactoriel(int n) {
        setN(n);
    }

    @Override
    public void setN(int n) {
        if (n < 0)
            throw new IllegalArgumentException("n doit être >= 0");
        this.n = n;
    }

    @Override
    public int getN() {
        return n;
    }

    @Override
    public long getReponse() {
        return reponse;
    }

    @Override
    public void calculerReponse() {
        if (n == 0) {
            reponse = 1;
            moinsUn = null;
        } else {
            moinsUn = new MonFactoriel(n - 1);
            moinsUn.calculerReponse();
            reponse = moinsUn.getReponse() * n;
        }
    }
}
