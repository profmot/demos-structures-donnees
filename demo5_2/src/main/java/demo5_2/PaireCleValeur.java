package demo5_2;

public class PaireCleValeur {
	
	private String cle;
	private Object valeur;
	
	public PaireCleValeur(String cle, Object valeur) {
		
		this.cle = cle;
		this.valeur = valeur;
		
	}
	

	public String getCle() {
		return cle;
	}
	public void setCle(String cle) {
		this.cle = cle;
	}
	public Object getValeur() {
		return valeur;
	}
	public void setValeur(Object valeur) {
		this.valeur = valeur;
	}
	
	
	

}
