/* WAP to use random class and generate random numbers*/

import java.util.Random;

class random{
	public static void main(String[] args) {
		Random dice = new Random();
		int number;
		
		for (int counter = 1; counter <= 10; counter++) {
			number = dice.nextInt(6); // parameter = no. of options
			//default options - 0 to 5
			System.out.println(number);
			
			number = 1+dice.nextInt(6) //illusion that it is dice
			System.out.println("Dice number : " + number);
		}
	}
}