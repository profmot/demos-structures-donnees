package demo4_3a;

import demo4_3a.validateur.Modele;

@SuppressWarnings("serial")
public class ListeXGr3 extends Modele<ListeXGr3> {
    
	
	private Case<Character> tete   = null;
	private int  taille = 0;

    

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

			tete = new Case<Character>(c);
			taille = 1;

		}else if(taille == 1){
			
			tete.setSuivant(new Case<Character>(c));
			taille = 2;
			
		}else {
			
			Case<Character> curseur = tete;

			while(curseur.suivantExiste()) {
				curseur = curseur.getSuivant();
			}

			curseur.setSuivant(new Case<Character>(c));
			taille++;
		}

    }
	
	

    public int size() {
    	return taille;
    }

    private void insert(int position, char c) {
    	Case<Character> nouveau = null;
    	Case<Character> curseurAvant = null;
    	Case<Character> curseurApres = null;

    	curseurAvant = tete;
    	for(int i = 0; i < position -1; i++) {
    		curseurAvant = curseurAvant.getSuivant();
    	}
    	
    	curseurApres = curseurAvant.getSuivant();
    	
    	nouveau = new Case<Character>(c);
    	
    	curseurAvant.setSuivant(nouveau);
    	nouveau.setSuivant(curseurApres);
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
        new ListeXGr3().initialize();
    }

}
