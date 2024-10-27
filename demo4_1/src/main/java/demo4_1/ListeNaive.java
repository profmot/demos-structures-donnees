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

        this.removeIndex(2);

        this.removeValue('d');
        
        this.addAll(new char[] {'5','d','c','f'});

    }

    private void add(char c) {
    	
    	char[] unPlusGrand = new char[valeurs.length + 1];
    	
    	for(int i = 0; i < valeurs.length; i++) {
    		
    		unPlusGrand[i] = valeurs[i];
    		
    	}
    	
    	unPlusGrand[unPlusGrand.length - 1] = c;
    	
    	
    	this.valeurs = unPlusGrand;


    }
    
    
    

    private int indexOf(char c) {
    	int indice = -1;
    	
    	for(int i = 0; i < valeurs.length; i++) {
    		if(valeurs[i] == c) {
    			indice = i;
    			break;
    		}
    	}

    	return indice;
    }

    private void addAll(char[] valeurs_a_ajouter) {
    	for(char c : valeurs_a_ajouter) {
    		add(c);
    	}
    }



    private void removeIndex(int indice) {
    	char[] valeursOriginales = valeurs;

    	this.valeurs = new char[0];
    	
    	for(int i = 0; i < valeursOriginales.length; i++) {
    		if(i != indice) {
    			add(valeursOriginales[i]);
    		}
    	}
    }


    
    private void removeValue(char c) {
    	int indiceARetirer = indexOf(c);
    	if(indiceARetirer >= 0) {
    		removeIndex(indiceARetirer);
    	}
    }

    public static void main(String[] args) {
        new ListeNaive().initialize();
    }

}
