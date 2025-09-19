package demo2_3;

// Petit main de test
public class Demo {
    public static void main(String[] args) {
        MonCalculateur calc = new MonCalculateur(5);
        calc.calculerFactoriel();
        System.out.println("5! = " + calc.getResultat()); // 120
    }
}
