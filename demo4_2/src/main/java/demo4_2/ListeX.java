package demo4_2;

import demo4_2.validateur.Modele;

@SuppressWarnings("serial")
public class ListeX extends Modele<ListeX> {
    
	
    
	private Element tete = null;
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

	}

	private char get(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private Element atteindreElement(int position) {
		Element curseur = tete;
		
		if(siIndiceValide(position)) {
			for(int i = 0; i < position; i++) {
				curseur = curseur.getSuivant();
			}
		}
		
		return curseur;
	}
	

	private boolean siIndiceValide(int indice) {
		return indice >= 0 && indice < taille;
	}




	private void add(char c) {
		if(tete == null) {

			tete = new Element(c);
			taille = 1;

		}else {
			
			Element curseur = atteindreElement(taille -1);
			curseur.setSuivant(new Element(c));
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

    }






    
    private void removeValue(char c) {

    }

    public static void main(String[] args) {
        new ListeX().initialize();
    }

}
