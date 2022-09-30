package Class11;

public class Dog {

	String name;
	String color;
	String breed;
	double waight;
	int age;
	
	void bark() {
		System.out.println("Dog is barking ");
	}
	void sleep() {
		System.out.println("Dog is sleeping ");
	}
	public static void main (String[]ergs) {
		Dog dog=new Dog();
		dog.bark();
		dog.sleep();
		
		
	}
	
}