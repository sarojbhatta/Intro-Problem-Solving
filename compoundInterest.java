/* WAP to use foumula to calculate compound interest */

class compountInterest{
	public static void main (String[] args) {
		double amount;
		double principal = 10000;
		double rate = .01; //per day
		
		for (int days = 1; days<=20; days++) {
			amount = principal* Math.pow(1+rate, day);
			System.out.println(day + "  " + amount);
		}
	}
}