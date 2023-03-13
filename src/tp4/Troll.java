package tp4;

public class Troll extends examPersonnage{
    public static int DEFAUT_MENTAL = 42;
    
    public Troll() {
        super();
        setForceMentale(DEFAUT_MENTAL);
    }
    
    public Troll(String nom) {
        super(nom);
        setForceMentale(DEFAUT_MENTAL);
    }
    
    public String toString() {
        return "Troll ["+super.toString()+"]";
    }
    
    public String joue() {
        System.out.println(super.getNom() + " joue !");
        return super.getNom() + " joue !";
    }

    public static int getDEFAUT_MENTAL() {
        return DEFAUT_MENTAL;
    }

    public static void setDEFAUT_MENTAL(int mental) {
        DEFAUT_MENTAL = mental;
    }
}
