package demo4_1;

import demo4_1.validateur.Modele;

@SuppressWarnings("serial")
public class ListeNaive extends Modele<ListeNaive> {
    
    
	private char[] valeurs = new char[0];
    
    

    @Override
    public void initialize() {
        
        this.add('a');
        this.add('b');
        this.add('c');
        this.add('d');
        this.add('e');
        this.add('f');
        int i = this.indexOf('d');
        System.out.println(i);

		int taille = this.size();
        System.out.println("taille");
		System.out.println(taille);
        this.removeIndex(2);
        this.removeValue('d');
        taille = this.size();
		System.out.println("taille après remove");
		System.out.println(taille);

        this.addAll(new char[] {'5','d','c','f'});
		taille = this.size();
		System.out.println("taille addAll");
		System.out.println(taille);
    }

	private void add(char c) {
        // créer un nouveau tableau de char de longueur + 1
        
        // boucle qui ajoute tous les éléments déjà présent dans le tableau valeurs
        
    
        // ajout du nouvel élément à la dernière position du tableau
        
        //assigner valeur du nouveau tableau
    }

    private void addAll(char[] cs) {
        //boucle et ajoute chaque élément
    }

    private int indexOf(char c) {
        int indiceDe = -1;
        //boucle tous les elements de valeurs
            //si l'element à la position indice i = c
                //conserver l'indice i et arrêter
        return indiceDe;
    }

    private void removeIndex(int indice) {
        //créer un nouveau tableau d'une taille plus petite que longueur de valeur


        //boucler tous les éléments de valeur
            // si le i < indice, transférer la valeur dans le nouveau tableau à la même position
            
            // sinon si i > indice, transférer la valeur dans le nouveau tableau avec une position de moins
                
        //assigner valeurs du nouveau tableau
    }

	public int size(){
		return 0;
	}

    
    private void removeValue(char c) {
        // trouver le c à l'aide de la methode indexOf(c)
        //si trouvé ( indice >=0) enlever l'élément avec removeIndex
    }

    public static void main(String[] args) {
        new ListeNaive().initialize();
    }

}
