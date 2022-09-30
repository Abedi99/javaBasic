package Class4;

import java.util.Scanner;

public class inpoutFromKibord {

	public static void main(String[] args) {
		/*
		 * Scanner is a calss that helps us take the input from keboard
		 * it conains may diffrent smaller modus called methods that can help
		 * us take Strings booleans bascilly all types of data from the keyboard
		 */
		Scanner input= new Scanner(System.in);
		//a message will display to the user on the console to enter his/her name 
		System.out.println("plese enter your name ");
		//Activate the java program to take the input from the keyboard store
		//it inside the name varible
		String name=input.next();
		//prints whatever name the user enter on the keyboard on the console 
		System.out.println(name+" what is your name ");

	}

}
