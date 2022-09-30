package Class4;

public class NestedIfDemo2 {

	public static void main(String[] args) {
		
		/*
		 * nested if condition are condition which are dependent on each other if 
		 * outer condition not true inner condition is never checked 
		 * 
		 */
		 int money=12;

	        if(money>10) {  //outer conditions

	            System.out.println("Lets buy some eggs");}
	            int noOfEggs=2;

	            if(noOfEggs>0) {
	                System.out.println("lets boil the eggs");
	            }

	}
}


