/*WAP to display normal time of the set time. */

class timeNormalDriver{
	public static void main(String[] args) {
		timeNormal practiceObject = new timeNormal();
		
		System.out.println(practiceObject.toNormalTime());
		
		practiceObject.setTime(13, 27, 6);
		System.out.println(practiceObject.toNormalTime());
		
		
	}
}
