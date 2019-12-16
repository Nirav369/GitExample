package userInput;

public class evenNumbers {

	public static void main(String[] args) {
		int n = 49;
		System.out.println("Even numbers between 1 - 49 in Descending order:");
		for (int i=49; i<=n && i>0; i--) {
			if (i%2==0) {
				System.out.println(i + " ");
			}
		}

	}

}
