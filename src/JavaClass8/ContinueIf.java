package JavaClass8;

public class ContinueIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=20; i++) {

            if(i==3|| i==7|| i==11) {
                continue;
            }

            System.out.print(i+" ");
        }

        //continue - continues to the next iteration/cycle
        // moment Java sees continue -> it goes back to the beginning of the loop
        //it usually used inside some type of conditions

    }


	}


