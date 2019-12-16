

import java.util.Arrays;

public class StarPrinting {
	
	public void starPrint(String s) {
		
		String[][] input = new String[4][10];
		
		for(int i =0;i<10;i++) {
			for(int j =0;j<4;j++) {
				input[j][i] = s;
			}			
		}
		for(int i =0;i<10;i++) {
			for(int j =0;j<4;j++) {
				System.out.println(Arrays.toString(input[j][i]));
			}			
		}
		//System.out.println(Arrays.toString(input));
		//System.out.println();
		
	}

}
