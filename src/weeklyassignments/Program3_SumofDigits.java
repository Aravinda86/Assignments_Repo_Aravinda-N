package weeklyassignments;

public class Program3_SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12344;
		int sum = 0;
		while(num>0) {
			int lastDigit = num % 10;
			sum = sum + lastDigit;
			num = num/10;
		}
		System.out.println("The sum of the given number is:"+ sum);
	}

}
