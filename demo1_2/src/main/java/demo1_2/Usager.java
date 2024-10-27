package demo1_2;

import java.io.PrintStream;

public class Usager implements Affichable{

    @Override
    public void afficher(PrintStream out) {
        out.println("usager");
    }

}
