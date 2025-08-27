package demo1_2;

public abstract class Mission {
    
    private String nomMission;
    public Mission(String nomMission) {
        this.nomMission = nomMission;
    }

    //setter et getter
    public String getNomMission() {
        return nomMission;
    }   
    public void setNomMission(String nomMission) {
        if (nomMission != null)
        {
        this.nomMission = nomMission.toUpperCase();
        }
    }

    public void afficherNomMission() {
        System.out.println("Mission: " + nomMission);
    }

    public final void executer(Personnage p) {        // méthode commune (héritée telle quelle)
        System.out.println("\n=== Mission avec " + p.getNom() + " ===");
        preparer(p);
        demarrer(p);
        terminer(p);

    }

    protected abstract void preparer(Personnage p);  // méthode à redéfinir
    protected abstract void demarrer(Personnage p);  // méthode à redéfinir
    protected abstract void terminer(Personnage p);  // méthode à redéfinir
}
