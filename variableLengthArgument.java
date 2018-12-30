/* Write a program to implement the idea of variable length argument. */

class variableLengthArgument{
	public static void main (String[] args) {
		System.out.println(average(2, 4, 6, 8));
	}
	
	public static int average(int...numbers) {
		int total = 0;
		for (int x:numbers) {
			total+=x;
		}
		return total/numbers.length;
	}
}