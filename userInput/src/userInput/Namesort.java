package userInput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Namesort {

	public static void main(String[] args) {
		String[] names =  new String[3];
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the names: ");
		
		for (int i=0; i<3; i++) {
			names[i] = input.nextLine();
		}
		Arrays.sort(names, Collections.reverseOrder());
		System.out.printf("Sorted list of names:");
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		}

}
