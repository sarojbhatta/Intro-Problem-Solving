/* Write a program to use time-class with overloaded constructors and display time. */


class multipleConstructorDriver{
	public static void main(String[] args) {
		multipleConstructor obj1 = new multipleConstructor();
		multipleConstructor obj2 = new multipleConstructor(8);
		multipleConstructor obj3 = new multipleConstructor(2, 13);
		multipleConstructor obj4 = new multipleConstructor(5, 30, 44);
		
		System.out.printf("%s\n", obj1.toMilitary());
		System.out.printf("%s\n", obj2.toMilitary());
		System.out.printf("%s\n", obj3.toMilitary());
		System.out.printf("%s\n", obj4.toMilitary());
		
		
	}
}
