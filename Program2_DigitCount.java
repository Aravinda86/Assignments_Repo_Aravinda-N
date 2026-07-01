package weeklyassignments;

public class Program2_DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 234578766;
		int count = 0;
		while(num>0) {
			count++;
			num = num/10;
		}
		System.out.println("The count of the digits is:"+ count);
	}

}
