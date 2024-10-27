class Animal {
    void dormir() {
        System.out.println("Cet animal dort.");
    }
}

class Chien extends Animal {
    void aboyer() {
        System.out.println("Le chien aboie.");
    }
}

class Chat extends Animal {
    void miauler() {
        System.out.println("Le chat miaule.");
    }
}

public class App {
    public static void main(String[] args) {
        Animal monAnimal = new Chien();  
        monAnimal.dormir(); 
        
        
    }
}
