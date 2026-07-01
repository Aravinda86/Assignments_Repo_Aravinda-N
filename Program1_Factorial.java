package weeklyassignments;

public class Program1_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int factorial = 1;
		for(int i =1; i<= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of a given number is:"+ factorial);
	}

}
