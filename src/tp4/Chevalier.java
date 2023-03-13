package tp4;

public class Chevalier extends examPersonnage{
    public static int DEFAUT_PHYSIQUE = 50;
    
    public Chevalier() {
        super();
        setForcePhysique(DEFAUT_PHYSIQUE);
    }
    
    public Chevalier(String nom) {
        super(nom);
        setForcePhysique(DEFAUT_PHYSIQUE);
    }

    @Override
    public String toString() {
        return "Chevalier ["+super.toString()+"]";
    }
    
    public String joue() {
        System.out.println("Attention, Chevalier "+super.getNom() + " joue !");
        return "Attention, Chevalier "+super.getNom() + " joue !";
    }

    public static int getDEFAUT_PHYSIQUE() {
        return DEFAUT_PHYSIQUE;
    }

    public static void setDEFAUT_PHYSIQUE(int physique) {
        DEFAUT_PHYSIQUE = physique;
    }
    
}
