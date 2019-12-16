package HomeWork.I;

import java.util.Scanner;

public class TemperatureConverter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("INPUTBOX:");
		
		System.out.printf("\n\nPlease Enter the input Celsius temperature to convert: \t  ");
		
		double celsiusTemp;
		double fahrenheit;
		
		celsiusTemp = input.nextFloat();
		
		fahrenheit = 1.8*celsiusTemp +32;
		
		System.out.printf("\n\nOUTBOX:");
		
		System.out.printf("\n\nAbove Celsius temperature in Fahrenheit is: \t%.2f ", fahrenheit);
		
		
	}

}
