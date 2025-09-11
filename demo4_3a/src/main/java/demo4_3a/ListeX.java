package demo4_3a;

import demo4_3a.validateur.Modele;

@SuppressWarnings("serial")
public class ListeX extends Modele<ListeX> {
	
	private Cellule tete = null;
	private int taille = 0;

    @Override
    public void initialize() {
        this.add('a');
        this.add('b');
        this.add('c');
        this.add('d');
        this.add('e');
        
        this.insert(2, 'W');
    }    		

	private void add(char c) {
		if(tete == null) {
			
			tete = new Cellule(c);
			taille = 1;
			
		}else if(size() == 1) {
			
			tete.setProchain(new Cellule(c));
			taille = 2;

		}else {
			
			Cellule curseur = tete;
			while(curseur.prochainExiste()) {
				curseur = curseur.getProchain();
			}
			
			curseur.setProchain(new Cellule(c));
			taille++;
			
		}
    }
	
	

    public int size() {
    	return taille;
    }

    private void insert(int position, char c) {
    	Cellule curseurAvant = tete;
    	Cellule curseurApres = null;
    	Cellule nouveau = new Cellule(c);
    	
    	for(int i = 0; i < position-1; i++) {
    		curseurAvant = curseurAvant.getProchain();
    	}
    	
    	curseurApres = curseurAvant.getProchain();
    	/*
    	 * ce qu'on veut
    	 * --> avant --> nouveau --> apres
    	 * 
    	 */
    	nouveau.setProchain(curseurApres);
    	curseurAvant.setProchain(nouveau);
    	
    	taille++;
    	
    	
    	
    	
    	


	}

	private char get(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	private boolean siIndiceValide(int indice) {
		return false;
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
