/* Write a program to use timeMilitary and display input time in military time format */


class timeMilitaryDriver{
	public static void main(String[] args) {
		timeMilitary practiceObject = new timeMilitary();
		
		System.out.println(practiceObject.toMilitary());
		
		practiceObject.setTime(13, 27, 6);
		System.out.println(practiceObject.toMilitary());
		
		
	}
}
