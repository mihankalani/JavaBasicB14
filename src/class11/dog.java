package class11;

public class dog {
	// Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	// Labrador
	// with specific attributes and behaviors.
	String name;
	String size;
	double weight;
	double age;
	String gender;

	void bark() {
		System.out.println(name + " barks alot!");
	}

	void walk() {
		System.out.println(name + " is sutaible for walking");
	}

	public static void main(String[] args) {
		dog Huskey = new dog();
		Huskey.name = "coco";
		Huskey.size = "big";
		Huskey.age = 4.5;
		Huskey.gender = "female";
		Huskey.walk();
		System.out.println("_________________________________");

		dog Bulldog = new dog();
		Bulldog.name = "Benji";
		Bulldog.age = 3;
		Bulldog.gender = "male";
		Bulldog.bark();
		System.out.println("_________________________________");

		dog Labrador = new dog();
		Labrador.name = "anny";
		Labrador.weight = 80;
		Labrador.gender = "female";
		Labrador.walk();
	}
}
