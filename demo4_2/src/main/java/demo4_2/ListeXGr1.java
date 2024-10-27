package demo4_2;

import demo4_2.validateur.Modele;

@SuppressWarnings("serial")
public class ListeXGr1 extends Modele<ListeXGr1> {
    
	
	private Element tete;
	private int taille;
    
    

    @Override
    public void initialize() {
        
        this.add('a');
        this.add('b');
        this.add('c');
        this.add('d');
        this.add('e');
        this.add('f');

        this.insert(0,'w');
        this.insert(2,'y');
        
        char el = this.get(3);
        System.out.println(el);

        int i = this.indexOf('d');
        System.out.println(i);

        this.removeIndex(0);
        this.removeIndex(1);

        //this.removeValue('d');
        
        this.addAll(new char[] {'5','d','c','f'});

    }    		
	
	


    private void insert(int position, char c) {
    	if(position == 0) {
    		Element nouvelElement = new Element(c);
    		nouvelElement.setSuivant(tete);
    		
    		tete = nouvelElement;
    		
    	}else {
    		Element nouvelElement = new Element(c);
    		Element unAvant = atteindreElement(position -1);
    		
    		if(unAvant != null) {
				nouvelElement.setSuivant(unAvant.getSuivant());
				unAvant.setSuivant(nouvelElement);
    		}
    	}
	}

	private char get(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private Element atteindreElement(int position) {
		Element curseur = tete;
		
		for(int i  = 0; i < position && curseur != null; i++) {
			curseur = curseur.getSuivant();
		}
		
		return curseur;

	}

	private void add(char c) {
		if(tete == null) {
			tete = new Element(c);
			taille = 1;

		}else {
			
			Element dernier = atteindreElement(taille - 1);
			dernier.setSuivant(new Element(c));
			taille++;

		}

    }
    
    
    

    private int indexOf(char c) {
    	int indice = -1;
    	
    	
    	return indice;

    }

    private void addAll(char[] valeurs_a_ajouter) {
    }
    


    private void removeIndex(int indice) {
    	if(indice == 0 && taille >= 1) {

    		tete = tete.getSuivant();
    		taille--;
    		
    	}else if(indice >= 1){

    		int indiceUnAvant = indice - 1;
    		int indiceUnApres = indice + 1;

    		if(siIndiceValide(indiceUnAvant)) {

				Element unAvant = atteindreElement(indiceUnAvant);

				if(siIndiceValide(indiceUnApres)) {

					Element unApres = atteindreElement(indice+1);
					unAvant.setSuivant(unApres);

				}else {

					unAvant.setSuivant(null);

				}

				taille--;
    		}
    	}
    }




	private boolean siIndiceValide(int indice) {
		return indice >= 0 && indice < taille;
	}


    
    private void removeValue(char c) {

    }

    public static void main(String[] args) {
        new ListeXGr1().initialize();
    }

}
