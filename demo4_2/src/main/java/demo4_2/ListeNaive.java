package demo4_2;

@SuppressWarnings("serial")
public class ListeNaive { 
    
    private final int TAILLE_INITIALE=2;
	private char[] valeurs = new char[TAILLE_INITIALE];
    private int indiceDernier = -1;

    public void initialize() {
        
       
    }

    public void set(int position, char valeur){
        if(position>=0 && position<=indiceDernier){

            this.valeurs[position]=valeur;
        } else{
            throw new IndexOutOfBoundsException('position en dehors de la taille de notre tableau');
        }
    }

    public char get(int position){
        return this.valeurs[position];
    }


    private void agrandir(){

    }

	private void add(char c) {
       if (indiceDernier== valeurs.length-1){
         agrandir();
       }
       this.valeurs[indiceDernier+1]= c ;
       indiceDernier++;

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
		return indiceDernier +1;
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
