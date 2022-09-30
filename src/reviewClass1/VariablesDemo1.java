package reviewClass1;

public class VariablesDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if we want to store whole number we can use below data types numbers 
		//without decimal parts lake 10, 23,400000,10000000, etc but we can't use them to 
		//store decimal numbers like 12.3, 1.5, 100.4 etc
		//byte 
		//short
		//int 
		//long 
		//although above four data types can be use to store whole numbers but we 
		// we will be using int most of the time as it can handle upto billions and dose not 
		//east a lot of space from RAM where computer stores the programs witch are opened and 
		//running currently
		
		
		int box1=12;
		//char box1="S" ; not allowed as it creates confusion
		//int =>data tipe 
		//box1=> variable name 
		//=is called assignment and use to store data in variable 
		//12 it's the data that we want to store in box1
		//; language rule we need to end all the lines with semicolons 
		
		int box2;// creating a box but not storing data right away in the box 
		box2=20;
		
		box1=30;// i am replacing the value 12 stored in box1 with 30
		System.out .println(box1);
		System.out .println(box2);
		
		
		

	}

}
