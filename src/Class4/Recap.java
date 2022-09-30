package Class4;

public class Recap {

	public static void main(String[] args) {
		//Explicit/narrowing/manual
		
		short largerBox=127;
		byte smallerBox=(byte)largerBox;
		System.out.println(smallerBox);

		int largerBox1=127;
		short smallerBox1=(byte)largerBox;
		System.out.println(smallerBox);
		
		short smallerbox3=45;
		long largerBox3=smallerbox3;
		System.out.println(largerBox3);

	}

}
