package demo1_2;

class MissionCombat extends Mission {

    public MissionCombat(String nomMission) {
        super(nomMission);

        this.setNomMission("recherche et destruction");
        
    }

    @Override
    protected void preparer(Personnage p) {
        System.out.println("Le héros équipe son épée.");
    }

    @Override
    protected void demarrer(Personnage p) {
        System.out.println("Le combat de " + p.getNom()+ " commence !");
    }

    @Override
    protected void terminer(Personnage p) {
        System.out.println("Le héros"+p.getNom()+" a vaincu ses ennemis !");
    }

    @Override
    public void afficherNomMission() {
        System.out.println("Mission de Combat: " + getNomMission());
    }
}
