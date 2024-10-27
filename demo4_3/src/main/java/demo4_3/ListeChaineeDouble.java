package demo4_3;

import demo4_3.validateur.Modele;

@SuppressWarnings("serial")
public class ListeChaineeDouble extends Modele<ListeChaineeDouble> {
    
	
	private Element tete;
	private int taille;
    
    

    @Override
    public void initialize() {
        this.insert(0,'a');
        this.add('b');
        this.add('c');
        this.add('d');
        this.add('e');
        this.add('f');

        char el = this.get(1);
        System.out.println(el);

        el = this.get(4);
        System.out.println(el);

        int i = this.indexOf('b');
        System.out.println(i);

        i = this.indexOf('d');
        System.out.println(i);

        this.insert(0,'w');
        this.insert(5,'x');
        this.insert(4,'y');
        


        this.removeIndex(0);
        this.removeIndex(1);

        this.removeValue('d');
        
        this.addAll(new char[] {'5','d','c','f'});

    }    		
	
	


    private void insert(int position, char c) {
    	if(position == 0 && taille == 0) {
    		
    		add(c);

    	}else if(position == 0 && taille >= 1) {
    		
    		Element nouvelleTete = new Element(c);
    		Element dernier = tete.getPrecedent();
    		
    		nouvelleTete.setPrecedent(dernier);
    		dernier.setSuivant(nouvelleTete);
    		
    		nouvelleTete.setSuivant(tete);
    		tete.setPrecedent(nouvelleTete);
    		
    		tete = nouvelleTete;
			taille++;

    	}else if(siIndiceValide(position)) {
    		
    		Element nouveau = new Element(c);

    		Element ancien = atteindreElement(position);
    		Element avant = ancien.getPrecedent();
    		
    		nouveau.setSuivant(ancien);
    		ancien.setPrecedent(nouveau);

    		avant.setSuivant(nouveau);
    		nouveau.setPrecedent(avant);
			taille++;

    	}
	}

	private char get(int i) {
		char valeur = 0;
		
		if(siIndiceValide(i)) {
			Element element = atteindreElement(i);

			valeur = element.getValeur();
		}
		
		return valeur;
	}

	
	private Element atteindreElement(int position) {
		Element curseur = tete;

		if(position <= taille/2) {

			for(int i  = 0; i < position; i++) {
				curseur = curseur.getSuivant();
			}
			
		}else {

			for(int i  = 0; i < (taille - position); i++) {
				curseur = curseur.getPrecedent();
			}
		}
		
		return curseur;

	}

	private void add(char c) {
		if(tete == null) {
			tete = new Element(c);
			tete.setSuivant(tete);
			tete.setPrecedent(tete);
			taille = 1;

		}else if(taille == 1) {

			Element nouvelElement = new Element(c);
			tete.setSuivant(nouvelElement);
			tete.setPrecedent(nouvelElement);
			nouvelElement.setSuivant(tete);
			nouvelElement.setPrecedent(tete);
			taille = 2;
			
		}else {
			
			Element nouvelElement = new Element(c);
			Element dernierElement = tete.getPrecedent();
			
			dernierElement.setSuivant(nouvelElement);
			nouvelElement.setPrecedent(dernierElement);
			
			nouvelElement.setSuivant(tete);
			tete.setPrecedent(nouvelElement);
			
			taille++;
		}
    }

    private int indexOf(char c) {
		Element curseur = tete;
		int indice = -1;

		for(int i  = 0; i < taille; i++) {
			if(curseur.getValeur() == c) {
				indice = i;
				break;
			}
			
			curseur = curseur.getSuivant();
		}
    	
    	return indice;
    }

    private void addAll(char[] valeurs_a_ajouter) {
    	for(char c : valeurs_a_ajouter) {
    		add(c);
    	}
    }
    


    private void removeIndex(int indice) {
    }



	private boolean siIndiceValide(int indice) {
		return indice >= 0 && indice < taille;
	}


    
    private void removeValue(char c) {

    }

    public static void main(String[] args) {
        new ListeChaineeDouble().initialize();
    }

}
