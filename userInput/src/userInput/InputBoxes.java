package userInput;
import javax.swing.JOptionPane;

public class InputBoxes {

	public static void main(String[] args) {
		String tempC;
		tempC = JOptionPane.showInputDialog("Temperature in Celsius");
		int C = Integer.parseInt(tempC);
		double F = (C * (1.8)) + 32;
		JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit is: "+F);
		System.exit(0);
	}

}