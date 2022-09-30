package Class11;

public class Car {

	String color="White";
	String make="Tela";
	String model="S3";
	int year=2018;
	int Hp=300;
	
	void moveForward() {
		System.out.println("My car is Moving forward");
}  
	void moveBackward() {
	System.out.println("My car is Moving backward");
}
	
	public static void main (String[]ergs) {
		Car car=new Car();
		car.moveBackward();
		car.moveBackward();
		System.out.println("I have a "+car.color+" "+car.make+" and my car Model is "+car.year);
	}
}