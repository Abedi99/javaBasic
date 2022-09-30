package JavaClass5;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter person heights in inches.
		 *  Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
		 */
		int heights=79;
		if(heights<60) {
			System.out.println("The person is short");
		}if(heights==60 || heights==65 || heights==70) {
			
			System.out.println("The person heights is meduim");
		}if(heights>72 || heights==75 || heights>78){
			
			System.out.println("The person heights is Tall");
		}/*
	 * Write a program that will print whether it is a weekend or weekday. 
	 * If any day from 1-5 → output “It is a weekday”, 
	 * anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
	 */
		int Day=4;
		
		if(Day==1 || Day==2 || Day==3 || Day==4|| Day==5) {
			System.out.println("It is a weekday");
		}if(Day==6 || Day==7 ) {
			System.out.println("It is a weekend");
		}
		
	}

}
