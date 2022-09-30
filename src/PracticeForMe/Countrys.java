package PracticeForMe;

import java.util.Arrays;
import java.util.Scanner;

public class Countrys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scanner=new Scanner(System.in);
System.out.println("pleses enter how mony countrise you want to processs");
int size=Scanner.nextInt();
String[] countrise=new String[size];;
String[] capitals=new String[size];;

Scanner.nextLine();
for (int i=0;i<size;i++){
System.out.println("please emter the country name");

countrise[i]=Scanner.nextLine();
System.out.println("please enter the capital for "+ countrise[i]);

capitals[i]=Scanner.nextLine();
}
System.out.println(Arrays.toString(countrise));
System.out.println(Arrays.toString(capitals));
}

}