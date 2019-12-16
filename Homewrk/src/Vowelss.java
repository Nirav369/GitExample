

public class Vowelss {
	
	public void getVowel(char c) {
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
			System.out.println("Its a vowel");
		}
		else {
			System.out.println("Its not a vowel");
		}
		
		
	}

	//counting vowels
	
	public void countVowel (String v)
	{
		char[] ch =v.toCharArray();
		int count = 0;
		for(int i=0; i< ch.length;i++) 
		{
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				count += 1;
			}
		
		}
		System.out.println("Vowel count is: "+count);
	}
}
