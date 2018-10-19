import java.util.Scanner;

public class StringReverseConstructor {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String name = input.nextLine();
		
		Reverse(name);
		
	}
	
	public static void Reverse(String toreverse) {
		int inputLength = toreverse.length();
		
		char[] newname = new char[inputLength];
		
		for (int i = 0; i<inputLength; i++) {
			newname[(inputLength-i-1)] = toreverse.charAt(i);
		}
		
		System.out.println(newname);
	}

}
