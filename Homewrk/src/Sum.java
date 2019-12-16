

import java.util.*;

public class Sum {
	
	static void getTotal()
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		
		int b = myObj.nextInt();
		
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter second number: ");
			
		int c = myObj1.nextInt();
		int a;
		
		a = b + c;	
		
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		getTotal();
	}
}
