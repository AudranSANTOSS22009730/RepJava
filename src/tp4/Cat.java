package tp4;
public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow!");
    }
    
    public void methodeInaccessible() {
    	
    }
    public static void main(String[] args) {
        Cat lechat = new Cat("picachou");
        System.out.println(lechat);
    }
}