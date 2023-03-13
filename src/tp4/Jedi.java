package tp4;

public class Jedi extends Chevalier{
    public static int DEFAUT_PHYSIQUE = 150;
    public static int DEFAUT_MENTAL = 100;
    
    public Jedi() {
        super();
        setForcePhysique(DEFAUT_PHYSIQUE);
        setForceMentale(DEFAUT_MENTAL);
    }
    
    public Jedi(String nom) {
        super(nom);
        setForcePhysique(DEFAUT_PHYSIQUE);
        setForceMentale(DEFAUT_MENTAL);
    }
    
    public String joue() {
        System.out.println("Attention, Chevalier "+super.getNom() + " joue ! LA FORCE EST AVEC ELLE !");
        return "Attention, Chevalier "+super.getNom() + " joue ! LA FORCE EST AVEC ELLE !";
    }

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
    
    public static void main (String[] args) {
        Jedi testJedi = new Jedi("Guigstyle");
        System.out.println(testJedi);
        testJedi.joue();
    }
}
    