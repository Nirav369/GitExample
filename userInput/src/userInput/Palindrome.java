package userInput;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) {
		String original, reverse = ""; 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string or number: ");
		original = input.nextLine();
		for ( int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) 
			System.out.println("It is a palindrome.");
		else
			System.out.println("It isn't a palindrome.");   
   }
} 