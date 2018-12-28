/* Write a simple program to use doWhile loop */ 
/* Anytime you wanna do something at least once, you use a do loop, AND
   anytime you wanna test it first and only run it if the test is true, you use while loop, 
   but again, do-while loop guarantees you at least one run. */

class simpleDoWhile{
	public static void main (String[] args) {
		int counter = 0;
		
		do {
			System.out.println(counter);
			counter++
		} while (counter <= 10);
	}
}
