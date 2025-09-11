package demo4_3a;

import demo4_3a.validateur.Modele;

@SuppressWarnings("serial")
public class ListeXGr2 extends Modele<ListeXGr2> {
    
	
	private Element tete;
    
    

    @Override
    public void initialize() {
        
        this.add('a');
        this.add('b');
        this.add('c');
        this.add('d');
        this.add('e');
        this.add('f');

        this.insert(0,'w');
        
        char el = this.get(3);
        System.out.println(el);

        int i = this.indexOf('d');
        System.out.println(i);

        this.removeIndex(1);

        //this.removeValue('d');
        
        this.addAll(new char[] {'5','d','c','f'});

    }

    private void insert(int position, char c) {
    	if(position == 0) {

    		
    		Element nouvelleTete = new Element(c);
    		nouvelleTete.setSuivant(tete);
    		
    		tete = nouvelleTete;
    	
    	}else {
    	
    	}
	}

	private char get(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void add(char c) {
		if(tete == null) {
			tete = new Element(c);

		}else {
			
			Element curseur = tete;
			while(curseur.getSuivant() != null){
				
				curseur = curseur.getSuivant();
				
			}
			
			curseur.setSuivant(new Element(c));
			
			
		} 
		

    }
    
    
    

    private int indexOf(char c) {
    	int indice = -1;
    	
    	return indice;

    }

    private void addAll(char[] valeurs_a_ajouter) {
    }
    
    private Element atteindreElement(int position) {
    	Element curseur = tete;
    	
    	int i = 0;
    	
    	for(/* pass */ ; i < position && curseur != null; i++) {
    		curseur = curseur.getSuivant();
    	}
    	
    	if(i != position) {
    		curseur = null;
    	}
    	
    	return curseur;
    	
    }



    private void removeIndex(int indice) {
    	if(indice == 0) {

    		// TODO

    	} else if(indice > 0) {
			Element curseur = atteindreElement(indice-1);
			
			if(curseur != null
					&& curseur.getSuivant() != null) {

				curseur.setSuivant(curseur.getSuivant().getSuivant());
			}
    	}
    }


    
    private void removeValue(char c) {

    }

    public static void main(String[] args) {
        new ListeXGr2().initialize();
    }

}
