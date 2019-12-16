

import java.util.*;

public class Name 
{
	public static void main(String[] args) {
		
		String name;
		String name1;
		String name2;
	
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter first name: ");
	
	name = myObj.nextLine();
	
	Scanner myObj1 = new Scanner(System.in);
	System.out.println("Enter second name: ");
		
	name1 = myObj1.nextLine();
	
	Scanner myObj2 = new Scanner(System.in);
	System.out.println("Enter third name: ");
	
	name2 = myObj2.nextLine();
	
	String[] addNames = {name,name1,name2};
	
	Arrays.sort(addNames,Collections.reverseOrder());
	
	for(int i = 0;i<addNames.length;i++) {
	
		System.out.println(addNames[i]);
	}
	}

	
}
