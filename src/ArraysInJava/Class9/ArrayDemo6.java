package ArraysInJava.Class9;

import java.util.Arrays;

public class ArrayDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int size=10;
	        int [] arr=new int[10];
	        int start=11;
	        for(int i=0; i<arr.length;i++) {

	            arr[i]=start;
	            start--;
	        }

	        System.out.println(Arrays.toString(arr));
	        System.out.println("**");
	        int sum=0;
	        for(int num:arr) {
	            //sum+=num;
	            sum=sum+num;
	        }
	        System.out.println(sum);

	    }}