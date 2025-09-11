package demo4_1;

import demo4_1.validateur.Modele;

@SuppressWarnings("serial")
public class ListeNaiveGr2 extends Modele<ListeNaiveGr2> {
    
    private char[] valeurs = new char[0];
    
    

    @Override
    public void initialize() {
        
        this.add('a');
        this.add('b');
        this.add('c');
        this.add('d');
        this.add('e');
        this.add('f');
        this.indexOf('d');
        this.removeValue('d');
        this.removeIndex(2);
        
        this.addAll(new char[] {'5','d','c','f'});

    }

    private void addAll(char[] cs) {
        for(char c : cs) {
            add(c);
        }
    }

    private int indexOf(char c) {
        int indiceDe = -1;

        for(int i = 0; i < valeurs.length; i++) {
            if(valeurs[i] == c) {
                indiceDe = i;
                break;
            }
        }
        
        return indiceDe;
    }

    private void add(char c) {
        
        char[] unPlusGrand = new char[valeurs.length+1];
        
        for(int i = 0; i < valeurs.length; i++) {
            unPlusGrand[i] = valeurs[i];
        }
        
        unPlusGrand[unPlusGrand.length - 1] = c;
        
        valeurs = unPlusGrand;
    }

    private void removeIndex(int indice) {
        
        char[] unPlusPetit = new char[valeurs.length - 1];
        
        for(int i = 0; i < valeurs.length; i++) {
            if(i < indice) {
                
                unPlusPetit[i] = valeurs[i];
                
                
            }else if(i > indice) {
                
                unPlusPetit[i-1] = valeurs[i];
                
            }
            
        }
        
        valeurs = unPlusPetit;
        
    }


    
    private void removeValue(char c) {
        int indice = indexOf(c);
        if(indice>=0) {
            removeIndex(indice);
        }
    }

    public static void main(String[] args) {
        new ListeNaiveGr2().initialize();
    }

}
