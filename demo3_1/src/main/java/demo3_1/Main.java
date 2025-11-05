package demo3_1;

public class Main {

	public static void main(String[] args) {

		List<Number> listeNombres = new ArrayList<>();
		Joueur monJoueur = new Joueur();

		Entraineur monEntraineur = new Entraineur();

		// - utiliser le paramètre de type
		// - spécifier la valeur
		// concrète que prends le paramètre
		Equipe<Joueur> monEquipe = new Equipe();

		monEquipe.ajouterJoueur(monJoueur);

		// pas correct, peut pas ajouter Entraineur parce que c'est pas un joueur...
		monEquipe.ajouterJoueur(monEntraineur);

		Joueur premierJoueur = monEquipe.premierJoueur();

		// Entraineur entraineur = monEquipe.premierJoueur();

		Equipe<JoueurHockey> equipeHockey = new Equipe<>();
		Equipe<JoueurSoccer> equipeSoccer = new Equipe<>();

		equipeHockey.ajouterJoueur(new JoueurHockey());
		// equipeHockey.ajouterJoueur(new JoueurSoccer());

		equipeHockey.premierJoueur().getMinutesPenalites();

		equipeSoccer.premierJoueur().getNombreCartonsJaunes();

	}

}
