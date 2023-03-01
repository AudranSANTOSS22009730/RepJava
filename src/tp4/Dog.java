package tp4;

public class Dog extends Mammal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Dog[" + super.toString() + "]";
	}

	public void greets() {
		System.out.println("Woof!");
	}

	public static void main(String[] args) {
		Dog leChien = new Dog("Bill");
		leChien.greets();
		Animal theAnimal = new Cat("Garfield");
		System.out.println(theAnimal);

		if (theAnimal instanceof Cat) {
			((Cat) (theAnimal)).greets();
		} else {
			System.err.println("INTERDIT !");
		}

		theAnimal = new Dog("BillBill");
		System.out.println(theAnimal);

		if (theAnimal instanceof Dog) {
			((Dog) (theAnimal)).greets();
		}
		if (theAnimal instanceof Cat) {
			((Cat) (theAnimal)).methodeInaccessible();
		} else {
			System.err.println("INTERDIT !");
		}
	}
}
