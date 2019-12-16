package HomeWork.II;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class EvenNumbersDescendingOrder {
	
	public static void main(String[] args) throws ParseException{
		
		long startTime = System.currentTimeMillis();
		System.out.println("Start of the system time is: "+startTime+" milliseconds");
		
		//Initializing the List variables
		List<Integer> inputarr = new ArrayList<Integer>();
		List<Integer> inputLL = new LinkedList<Integer>(); 
		
		//Using ArrayList
		for(int i = 0; i< 50; i++) {
			if(i%2==0) {
				inputarr.add(i);
			}	
		}
		
		
		long endTimeForArr = System.currentTimeMillis();
		inputarr.sort(Comparator.reverseOrder());
		System.out.println(inputarr);
		System.out.println("Execution time for adding elements in Array List is: "+endTimeForArr+" milliSeconds");
		
		
		//Using LinkedList
		for(int i = 0; i< 50;i++) {
			if(i%2==0) {
				inputLL.add(i);
			}
		}
		
		
		long endTimeForLL = System.currentTimeMillis();
		inputLL.sort(Comparator.reverseOrder());
		System.out.println(inputLL);
		System.out.println("Execution time for adding elements in Linked List is "+endTimeForLL+" MilliSeconds");
		
		System.out.printf("\n\nWE CAN SEE THAT THERE IS PERFORMANCE (EXECUTION TIME) DIFFERENCE");
		System.out.printf("\n\nARRAY LIST EXECUTES FASTER IN ADDING ELEMENTS COMPARED TO LINKED LIST");
		
	
	}
	
	}


