package userInput;

import java.util.Random;

public class Array {

	public static void main(String[] args) {
		
		Random num = new Random();
		int[] alpha = new int[15];
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = num.nextInt();
			System.out.println(alpha[i]);
		}
		
		System.out.println("\n" + alpha [9]);
		
		alpha[4] = 35;
		System.out.println("\n" + alpha[4]);
		alpha[8] = alpha[5] + alpha[12];
		System.out.println("\n" + alpha[8]);

	}

}
