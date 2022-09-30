package Class4;

import java.util.Scanner;

public class inputfromKeyboard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("plse inter your age");
		int age=scanner.nextInt();
		if(age<10) {
			System.out.println("you should study");}
			else {
				System.out.println("you should start working");
			}
		}

	}


