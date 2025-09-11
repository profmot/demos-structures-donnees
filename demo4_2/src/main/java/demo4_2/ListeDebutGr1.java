package demo4_2;

import demo4_2.validateur.Modele;

@SuppressWarnings("serial")
public class ListeDebutGr1 extends Modele<ListeDebutGr1> {
    
	
    
	private char[] grosTableau = new char[2];
	private int    indiceDernier = -1;
    

    @Override
    public void initialize() {
    	
    	this.add('A');
    	this.add('B');
    	this.add('C');

    	this.add('D');
    	this.add('E');
    	this.add('F');

    	this.add('G');
    	this.add('H');
    	this.add('I');

    	this.add('J');
    	//this.add('K');
    	
    	
    	
    	int taille = this.size();
    	System.out.println(taille);

    }

    private void add(char valeur) {
    	if(siBesoinAgrandir()) {
    		agrandirTableau();
    	}

    	indiceDernier++;
    	grosTableau[indiceDernier] = valeur;
    }

	private boolean siBesoinAgrandir() {
		return indiceDernier == grosTableau.length - 1;
	}

    private void agrandirTableau() {
    	char[] nouveau = new char[grosTableau.length * 2];
    	
    	for(int i = 0; i < grosTableau.length; i++) {
    		nouveau[i] = grosTableau[i];
    	}
    	
    	this.grosTableau = nouveau;
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
