package userInput;
import javax.swing.JOptionPane;

public class Sum {

	public static void main(String[] args) {
		String num1, num2;
		num1 = JOptionPane.showInputDialog("Enter First Number: ");
		num2 = JOptionPane.showInputDialog("Enter Second Number: ");
		int numb1 = Integer.parseInt(num1);
		int numb2  = Integer.parseInt(num2);
		int sum = numb1 + numb2;
		JOptionPane.showMessageDialog(null, "Sum: " + sum);

	}

}
