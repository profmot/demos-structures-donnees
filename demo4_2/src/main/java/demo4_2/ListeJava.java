package demo4_2;

public class ListeJava {
    public static void main(String[] args) {
        java.util.List<Character> liste = new java.util.ArrayList<>();

        liste.add('A');
        liste.add('B');
        liste.add('C');
        liste.add('D');
        liste.add('E');

        System.out.println("Taille de la liste : " + liste.size());

        for (int i = 0; i < liste.size(); i++) {
            System.out.println("Élément à l'indice " + i + " : " + liste.get(i));
        }
    }

}
