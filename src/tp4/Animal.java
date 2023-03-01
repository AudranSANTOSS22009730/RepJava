package tp4;

public class Animal {
	private String name;
	 
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Animal[name=" + name + "]";
	}
	public static void main(String[] args) {
		Animal a =new Animal("médor");
		System.out.println("test1 : a=" + a);
	}
}
