package Class4;

import java.util.Scanner;

public class InputFromKeyboard3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please inter your name");
		//take a String type input from the keyboard and stores it in name variable
		String name =scanner.nextLine();
		System.out.println("please inter your age");
		//take an int from keyboard and stores it in age variable 
		int age=scanner.nextInt();
		
		System .out.println ("hi "+name+"your "+age+" years old");

	}

}
