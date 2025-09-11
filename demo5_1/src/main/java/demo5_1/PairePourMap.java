package demo5_1;

public class PairePourMap<C,V> {
	
	public C cle;
	public V valeur;
	
	public PairePourMap(C gauche, V droite) {
		this.cle = gauche;
		this.valeur = droite;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;

		if(obj instanceof PairePourMap) {
			return ((PairePourMap) obj).cle.equals(this.cle);
		}
		
		return false;
	}

}
