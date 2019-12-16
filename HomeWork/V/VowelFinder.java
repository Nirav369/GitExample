package HomeWork.V;

import java.util.Scanner;

public class VowelFinder {
	
	
	public boolean isVowel(char c) {
		
		char ch = Character.toLowerCase(c);
		
		
		if(ch == 'a'||ch == 'e'||ch == 'i' ||ch == 'o'||ch == 'u') {
			//System.out.println("character "+c+" is a Vowel");
			return true;
				
		}
		else {
			//System.out.println("character "+c+" is not a Vowel");
			return false;
		}
		
	}
	
	public void countVowels() {
		
		String str;
		Scanner input = new Scanner(System.in);
		System.out.printf("\tVOWEL COUNTER");
		System.out.printf("\n\tPlease enter the String :");
		str = input.nextLine();
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		int count = 0;
		for(int i =0;i<str.length();i++) {
			if(ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i' ||ch[i] == 'o'||ch[i] == 'u') {
				//System.out.println("character "+c+" is a Vowel");
				count++;	
			}
		}
		System.out.printf("\n\tNumber of Vowels in the string: %d",count);
		
		
	}
	
	
	
	
}
