package tp4;

public abstract class examPersonnage {
    public static int DEFAUT_PHYSIQUE = 10;
    public static int DEFAUT_MENTAL = 10;
    public static int dernierID = 0;
    private String nom;
    private int forcePhysique;
    private int forceMentale;
    private int id;
    
    public abstract String joue();

    public static int getDEFAUT_PHYSIQUE() {
        return DEFAUT_PHYSIQUE;
    }

    public static void setDEFAUT_PHYSIQUE(int physique) {
        DEFAUT_PHYSIQUE = physique;
    }

    public static int getDEFAUT_MENTAL() {
        return DEFAUT_MENTAL;
    }

    public static void setDEFAUT_MENTAL(int mental) {
        DEFAUT_MENTAL = mental;
    }
    
    public static int getDernierID() {
        return dernierID;
    }
    
    public examPersonnage() {
        id = ++dernierID;
        forcePhysique = DEFAUT_PHYSIQUE;
        forceMentale = DEFAUT_MENTAL;
        nom = "monPerso" + id;
    }
    
    public examPersonnage(String nom) {
        id = dernierID + 1;
        dernierID = id;
        forcePhysique = DEFAUT_PHYSIQUE;
        forceMentale = DEFAUT_MENTAL;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getForcePhysique() {
        return forcePhysique;
    }

    public void setForcePhysique(int forcePhysique) {
        this.forcePhysique = forcePhysique;
    }

    public int getForceMentale() {
        return forceMentale;
    }

    public void setForceMentale(int forceMentale) {
        this.forceMentale = forceMentale;
    }

    @Override
    public String toString() {
        return "Personnage[nom=" + nom + ", forcePhysique=" + forcePhysique + ", forceMentale=" + forceMentale + "]";
    }
    
    
    
}