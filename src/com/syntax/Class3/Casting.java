package com.syntax.Class3;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * type casting => type= data type casting =converting converting one data type 
		 * to another
		 */
		
		byte box1=127; // smallest box
		short box2=3333; // we can't store the decimal number in a box of int 
		int box3=45454545;//large box most commonly used
		long box4=45454545;//Slighly  larger box
		float box5=414543634; //larger box
		double box6= 4545454545.0;// largest 
	
	
		
		int number =(int)15.2; // we can't store the decimal number in box type int 
		System.out.println(number);
		
		byte smallerBox=(byte)box2;
		System.out.println(smallerBox);
		
		short biggerBpx=box1;
		
		long box7=box1; //we can do this because box 7is larger then box1
		float box8=(float)box6; 
		
		char a=(char)67;
		System.out.println(a);

		int box9=(int)box4;
		System.out.println(box9);
	}

}
