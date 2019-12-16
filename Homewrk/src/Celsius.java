

import java.util.Scanner;

public class Celsius 
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("In Celsius: ");
		
		double f; 
		double c = 0;
		
		c = myObj.nextFloat();
		
		f = (1.8 * c) + 32;
		
		System.out.println("In Fahrenheit: "+ f);
		
	}
}
