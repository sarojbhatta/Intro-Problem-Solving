/* WAP to calculate average of given 10 integer numbers. */

import java.util.Scanner;

class average{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int average;
		int counter = 0;
		
		while (counter<10) {
			System.out.println("Enter next number: ");
			total += input.nextInt();
			counter ++;
		}
		average = total/10;
		System.out.println("Average is: " + average);
	}
}