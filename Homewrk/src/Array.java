

import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	{
		int[] intAlpha = new int[15];
	
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter 15 elements: ");
		
		for(int i =0; i<intAlpha.length;i++) {
			intAlpha[i] = myObj.nextInt();
		}
		
		for(int i =0; i<intAlpha.length;i++) {
			System.out.println(intAlpha[i]);
		}
			System.out.println("The 10th element is: "+intAlpha[10]);
	
		
			intAlpha[5] = 35;
			intAlpha[9] = intAlpha[6] + intAlpha[13];
			
			System.out.println("the 5th element is: "+ intAlpha[5]);
			System.out.println("the 9th element is: "+ intAlpha[9]);
}}


