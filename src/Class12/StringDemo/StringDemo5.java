package Class12.StringDemo;

import java.util.Arrays;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="I love java programming";
        /*
         * toCharArray will convert a String to an array of chars
         */
        char[] charArray=str.toCharArray();

        System.out.println(Arrays.toString(charArray));
System.out.println((charArray[7]));

    }


	}


