/* WAP to create multidimentional array and print a table for it. */

class tableArrays{
	public static void main (String[] args) {
		int firstarray[][] = {{1, 5, 27}, {5, 2, 9}, {1, 1, 1}};
		int secondarray[][] = {{20, 40, 60}, {88}, {4, 6}};
		
		System.out.println("This is second array: ");
		display(secondarray);
	}
	
	public static void display(int x[][]) {
		for (int row = 0; row<x.length; row++) {
			for (int col = 0; col<x[row].length; col++) {
				System.out.print(x[row][col]+"\t");
			}
			System.out.println();
		}
	}
}