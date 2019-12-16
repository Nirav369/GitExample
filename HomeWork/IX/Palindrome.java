package HomeWork.IX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {
	
	public void palindromeFinder() {
		
		int number = 0;
		String reverse = "";
		Scanner input = new Scanner(System.in);
		System.out.printf("\nEnter the Input Number: ");
		
		
		while(true) {
			try {
				number = input.nextInt();
				if(number<0) {
					throw new InputMismatchException();
				}
				else {
					String str = Integer.toString(number);
					for(int i = str.length()-1;i>=0;i--) {
						reverse += str.charAt(i);	
					}
				//System.out.println(reverse);
				
					if(str.equals(reverse)) {
						System.out.printf("\n\nThe Given input %s is a palindrome", str);
						System.out.printf("\nPalindrome of input %s is %s",str,reverse);
						}
					else {
						System.out.printf("\n\nThe given input is not a palindrome");
						}
				}
				}
			catch(InputMismatchException e){
				input.nextLine();
				System.out.printf("\n\nOnly Positive Integers are allowed to enter");
				
				}
		}		
	}		
}

