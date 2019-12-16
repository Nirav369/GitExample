package HomeWork.VI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortDescending {
	
	public static void main(String[] args) {
		
		
		String[] str = new String[3];
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the names to be sorted: \n");
		
		
		for(int i =0;i<3;i++) {
			str[i] = input.nextLine();
		}
		
		//Collections.reverseOrder();
		//Arrays.sort(str);// Ascending order
		Arrays.sort(str,Collections.reverseOrder());//descending order
		
		System.out.printf("\nSorted names in Descending Order:");
		
		for(int i =0;i<str.length;i++) {
			System.out.printf("\n\n%s",str[i]);
		}
	}

}
