package tp4;

public class Mammal extends Animal{
	public Mammal(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Mammal []";
	}
	
	public static void main(String[] args) {
		Animal mam = new Mammal("toto");
		System.out.println("mamifère mam=" + mam);
	}
}
