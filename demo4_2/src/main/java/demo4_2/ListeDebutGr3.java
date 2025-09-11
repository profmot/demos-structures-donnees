package demo4_2;

import demo4_2.validateur.Modele;

@SuppressWarnings("serial")
public class ListeDebutGr3 extends Modele<ListeDebutGr3> {
    
	
    
	private char[] grosTableau = new char[10];
	private int indiceDernier = -1;
    

    @Override
    public void initialize() {
    	
    	this.add('A');
    	this.add('B');
    	this.add('C');
    	this.add('D');
    	

    }

    private void add(char valeur) {
    	if(siDoitAgrandir()) {
    		agrandir();
    	}
    	indiceDernier++;
    	grosTableau[indiceDernier] = valeur;
    }

    private void agrandir() {
    	char[] nouveau = new char[grosTableau.length*2];
    	
    	for(int i = 0; i < grosTableau.length; i++) {
    		nouveau[i] = grosTableau[i];
    	}
    	
    	this.grosTableau = nouveau;
	}

	private boolean siDoitAgrandir() {
		return indiceDernier == grosTableau.length-1;
	}

	private void insert(int indice, char valeur) {

    }


    private void addAll(char[] valeurs) {

    }


    private int size() {
		return indiceDernier + 1;
    }

    private char get(int indice) {
    	return grosTableau[indice];
    }
    
    private void set(int indice, char valeur) {
    	grosTableau[indice] = valeur;
    }

}
