package demo4_1;

import demo4_1.validateur.Modele;

@SuppressWarnings("serial")
public class ListeNaive extends Modele<ListeNaive> {
    
	
    
	private char[] elements = new char[] {'a','b','c'};
    

    @Override
    public void initialize() {
    	
    	this.add('A');
    	this.add('B');
    	this.add('C');
    	this.addAll(new char[]{'X', 'Y', 'Z'});

    }

    private void add(char valeur) {
    	insert(elements.length, valeur);
    }

    private void insert(int indice, char valeur) {
    	char[] nouveauxElements = new char[elements.length+1];
    	
    	for(int i = 0; i < indice; i++) {
    		nouveauxElements[i] = elements[i];
    	}
    	
    	for(int i = indice; i < elements.length; i++) {
    		nouveauxElements[i+1] = elements[i];
    	}
    	
    	nouveauxElements[indice] = valeur;
    	
    	this.elements = nouveauxElements;
    }


    private void addAll(char[] valeurs) {
    	for(char valeur : valeurs) {
    		add(valeur);
    	}
    }


    private int size() {
		return 0;
    }

    private char get(int indice) {
    	return elements[indice];
    }
    
    private void set(int indice, char valeur) {
    	elements[indice] = valeur;
    }

}
