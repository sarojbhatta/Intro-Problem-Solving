/*Write a JAVA program that asks the user to enter in a power between 1 and 4 inclusive. 
Next, the program asks the user to input a base between 20 and 30 inclusive. 
Your program then raises the base to the power and prints to the result.*/

import java.util.Scanner;

public class ComputeExponent {
	public static void main (String[] args) {
		
		int exponent = 0;
		int base = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the exponent [0<exponent<5]: ");
		//exponent = input.nextInt();
		while(exponent<1 || exponent>4) {
			int currExp = input.nextInt();
			if (currExp<1 || currExp>4) {
				System.out.println("Exponent out of range. Please enter an exponent: 0<exponent<5");
				System.out.println("");
			}
			else {
				exponent = currExp;
			}
		}
		
		System.out.print("Enter the base [19<base<31]");;
		while(base<20 || base>30) {
			int currBase = input.nextInt();
			if (currBase<20 || currBase>30) {
				System.out.println("Base out of range. Please enter a base: 19<base<31");
			}
			else {
				base = currBase;
			}
		}
		
		int productValue = 1;
		for (int i = 0; i<exponent; i++) {
			productValue *= base;
		}
		
		System.out.println("(" +base+ ")" + "^" + exponent + " = " + productValue);
		
	}
}
