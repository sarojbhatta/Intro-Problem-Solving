/* Writw a simple program to add two numbers using GUI. */

import javax.swing.JOptionPane;

public class SumByGUI{

	public static void main(String[] args) {
		String firstnum = JOptionPane.showInputDialog("Enter 1st num: ");
		String secondnum = JOptionPane.showInputDialog("Enter 2nd num: ");
		
		int fn = Integer.parseInt(firstnum);
		int sn = Integer.parseInt(secondnum);
		
		int sum = fn+sn;
		
		JOptionPane.showMessageDialog(null, "The sum is: " + sum, "Sum", JOptionPane.PLAIN_MESSAGE);

	}

}
