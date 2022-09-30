package PracticeForMe;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).

		char[] alpha=new char[6];
		alpha[0]='A';
		alpha[1]='B';
		alpha[2]='C';
		alpha[3]='D';
		alpha[4]='E';
		alpha[5]='F';
		System.out.println(alpha[1]);
		
		
		char[] Alpha= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(Alpha[3]);
		
		
		for(char a:alpha) {
			System.out.print(a+" ");
		}
		
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i]+" ");
		}
	}
	

}
