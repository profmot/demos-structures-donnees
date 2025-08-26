package demo1_2;

import demo1_2.validateur.Modele;

public class Demo2 extends Modele<Demo2> {
	
	public static void main(String[] args) {
		new Demo2().initialize();
	}

	@Override
	public void initialize() {

		Personnage[] personnages = new Personnage[2];

		personnages[0] = new Guerrier("Arthas");
        personnages[1] = new Mage("Jaina");

        // Polymorphisme : même type abstrait, comportements différents
        personnages[0].attaquer();
        personnages[1].attaquer();

        personnages[0].defendre();
        personnages[1].defendre();

        personnages[0].subirDegats(30);
        personnages[1].subirDegats(50);

	}

}
