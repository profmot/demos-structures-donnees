package demo1_2;

import demo1_2.validateur.Modele;

public class Demo2 extends Modele<Demo2> {
	
	public static void main(String[] args) {
		new Demo2().initialize();
	}

	
	private Affichable[] banques = new Affichable[3];
	private Usager usager = new Usager();


	@Override
	public void initialize() {

		banques[0] = new BanqueEnLigne("BNC", 5, "bnc.ca");
		banques[1] = new BanqueTrad("Desjardins", 3);




		banques[0].afficher(System.err);
		banques[1].afficher(System.out);
		usager.afficher(System.out);




	}

}
