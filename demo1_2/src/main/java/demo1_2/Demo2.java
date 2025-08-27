package demo1_2;

import java.util.List;

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


/*      // Upcasting implicite: sous-classes vues comme Personnage
        List<Personnage> equipe = List.of(
            new Guerrier("Arthas"),
            new Mage("Jaina")
        );

        Mission mission = new MissionCombat();

        // POLYMORPHISME: le même code appelle la "bonne" implémentation
        for (Personnage p : equipe) {
            mission.executer(p);
        }

        // instanceof (pattern matching) + transtypage sécurisé
        Personnage a = equipe.get(0); // Guerrier
        if (a instanceof Guerrier g) {
            g.coupPuissant(); // OK, accès à l’API Guerrier
        }

        Personnage b = equipe.get(1); // Mage
        if (b instanceof Mage m) {
            m.lancerSort(); // OK, accès à l’API Mage
        }

        // Downcast "classique" (évitez sans instanceof)
        Personnage x = new Guerrier("Thorin");
        if (x instanceof Guerrier) {
            Guerrier gx = (Guerrier) x; // cast explicite
            gx.coupPuissant();
        }

        // Mauvais cast (exemple à NE PAS faire) : ClassCastException
        // Guerrier gg = (Guerrier) new Mage("FauxGuerrier"); // NE PAS FAIRE
    }
 */
	}

}
