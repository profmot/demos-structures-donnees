package demo4_2;

@SuppressWarnings("serial")
public class ListeNaive { 
    
    
	private char[] valeurs = new char[0];
    

    public void initialize() {
        this.add('a');
        this.add('b');
        this.add('c');
        this.add('d');
        this.add('e');
        this.add('f');

        
        char el = this.get(3);
        System.out.println(el);

        int i = this.indexOf('d');
        System.out.println(i);

        this.removeIndex(0);
        this.removeIndex(1);

        //this.removeValue('d');
        
        this.addAll(new char[] {'5','d','c','f'});

       
    }

    public void set(int position, char valeur){
        this.valeurs[position]=valeur;
    }

    public char get(int position){
        return this.valeurs[position];
    }

	private void add(char c) {
        // créer un nouveau tableau de char de longueur + 1
        char[] nouveauTableau = new char[valeurs.length+1];
        
        // boucle qui ajoute tous les éléments déjà présent dans le tableau valeurs
        for(int i =0; i<valeurs.length;i++){
            nouveauTableau[i] = valeurs[i];
        }
    
        // ajout du nouvel élément à la dernière position du tableau
        nouveauTableau[nouveauTableau.length -1] = c; 
        //assigner valeur du nouveau tableau
        this.valeurs = nouveauTableau;
    }

    private void addAll(char[] cs) {
        //boucle et ajoute chaque élément
        for(int i =0 ; i<cs.length;i++){
            add(cs[i]);
        }
    }

    private int indexOf(char c) {
        int indiceDe = -1;
        //boucle tous les elements de valeurs
            //si l'element à la position indice i = c
                //conserver l'indice i et arrêter
        for(int i =0; i<valeurs.length; i++){
            if( valeurs[i] == c){
                indiceDe = i;
                break;
            }
        }
        return indiceDe;
    }

    private void removeIndex(int indice) {
        //créer un nouveau tableau d'une taille plus petite que longueur de valeur
        char[] nouveauTableau = new char[valeurs.length-1];
        for( int i = 0; i< valeurs.length;i++){
            if (i< indice){
                nouveauTableau[i] = valeurs[i];
            } else if( i>indice){
                nouveauTableau[i-1] = valeurs[i];
            }
        }
        //assigner valeurs du nouveau tableau
        valeurs = nouveauTableau;
    }

	public int size(){
		return valeurs.length;
	}

    
    private void removeValue(char c) {
        int indiceAEnlever= indexOf(c);
        if(indiceAEnlever>=0 ){
            removeIndex(indiceAEnlever);
        }
    }

    public static void main(String[] args) {
        new ListeNaive().initialize();
    }

}