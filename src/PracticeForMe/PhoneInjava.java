package PracticeForMe;

public class PhoneInjava {
	String make;
	String model;
	String color;
	double size;
	boolean expencsive;

	void Calling() {
		System.out.println("it can take a photo from for distence");
	}
	void Calling1() {
		System.out.println("the camera is not good ");
	}
	void Calling2() {
		System.out.println("the camera is better then the Iphon");
	}

	public static void main(String[] args) {
		PhoneInjava Phone = new PhoneInjava();
		Phone.make = "Apple";
		Phone.model = "iphone 4s";
		Phone.color = "Black";
		Phone.size = 123;
		Phone.expencsive = true;
		System.out.println(Phone.make + " " + Phone.size + " " + Phone.color + " " + Phone.expencsive);
		Phone.Calling();

		PhoneInjava Phone1 = new PhoneInjava();

		Phone1.make = "Pixel";
		Phone1.model = "s";
		Phone1.color="White";
		Phone1.size=456;
		Phone1.expencsive=false;
		
		System.out.println(Phone1.make + " " + Phone1.size + " " + Phone1.color + " " + Phone1.expencsive);
		Phone1.Calling1();

		PhoneInjava Phone2 = new PhoneInjava();
		Phone2.make = "Sumsong";
		Phone2.model = "Glaxy";
		Phone2.color="red";
		Phone2.size=65;
		Phone2.expencsive=true;
		
		System.out.println(Phone2.make + " " + Phone2.size + " " + Phone2.color + " " + Phone2.expencsive);
		Phone2.Calling2();

		
	

	}
}
