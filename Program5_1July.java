package dailyassignments;

public class Program5_1July {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Printing alternate upper case using while loop
		int alpha1 = 65; int alpha2 = 90;
		int upper1 = 65, upper2 = 90;
		
		while(alpha1<=alpha2) {
			System.out.print((char)alpha1 +" ");
			alpha1+=2;
		}
		
		System.out.println("\n\n");
		//Printing upper case A to Z using while loop
		while(upper1<=upper2) {
			System.out.print((char)upper1 +" ");
			upper1++;
				
		}
	}

}
