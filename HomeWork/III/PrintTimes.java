package HomeWork.III;

public class PrintTimes {
	
	public void fourTimesStar(String str) {
		
		for(int i =0;i<4;i++) {
			System.out.println(str);
		}
	}
	
	public void addRight(String str) {
		
		char[] newstr = new char[str.length()];
		
		for(int i =0; i<str.length();i++) {
			
			newstr[i] = str.charAt(i);
			
			System.out.println(newstr);
			
		}	
	}

	public void addLeft(String str) {
		
		char[] newstr = new char[str.length()];
		
		for(int i = str.length() -1;i>=0;i--) {
			
			newstr[i] = str.charAt(i);
			System.out.println(newstr);
		}
	}
}
