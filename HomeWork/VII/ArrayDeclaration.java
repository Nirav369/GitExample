package HomeWork.VII;

import java.util.Scanner;

public class ArrayDeclaration {
	
	public static void main(String[] args) {
		
	int[] alpha = new int[15];
	
	Scanner input = new Scanner(System.in);
	
	System.out.printf("\nEnter the elements in the alpha array: \n");
	
	for(int i = 0; i< alpha.length ;i++) {
		alpha[i] = input.nextInt();
	}
	
	//Tenth element of the array
	System.out.printf("\nTenth Element in the array is %d", alpha[9]);
	
	//Set the  fifth element to 35
	System.out.printf("\n\nFifth Element in the alpha array is %d ",alpha[4]);
	alpha[4] = 35;
	System.out.printf("\n\nUpdated fifth element in the alpha array is %d ",alpha[4]);
	
	//Set the nineth element to sum of sixth and thirteenth
	System.out.printf("\n\nnineth Element in the alpha array is %d ",alpha[8]);
	System.out.printf("\n\nSixth element in the alpha array is %d ",alpha[5]);
	System.out.printf("\n\nThirteenth element in the alpha array is %d ",alpha[12]);
	alpha[8] = alpha[5]+alpha[12];
	System.out.printf("\n\nUpdated Nineth element in the alpha array is %d ",alpha[8]);
	}
}
