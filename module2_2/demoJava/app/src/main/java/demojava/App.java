package demojava;


public class App {
    
    public static void main(String[] args) {
        DemoLists dl = new DemoLists();
        System.out.println(dl.testLists());
        Sorte sorte; 
        sorte = Sorte.COEUR;
        System.out.println(sorte.name());
    }
}
