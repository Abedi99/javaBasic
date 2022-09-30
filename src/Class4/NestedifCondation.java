package Class4;

public class NestedifCondation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time=5;
		String day="monday";
		if(day.equals("monday")) { //it is called outer if condition if it is true inner condition will be checked if it is 
			//false nothing from inner if condition will be executed it is like the main door
			//if the main door is closed we can not enter 
			
			if(time>7) {
				System.out.println("lets go to office");
			}
		
		if (time<6) {
			System.out.println("lets sleep more");
		}
		

	}
		int date=9;
		String Day="friday";
		if (date==9) {
			System.out.println("is not holiday");
			if (Day.equals("friday")) {
				System.out.println("we have calss");
			}
		}
		
		
		

}}
