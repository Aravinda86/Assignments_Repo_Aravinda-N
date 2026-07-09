package dailyassignments;

public class Program6_DiamondPattrenPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int star=3;star<=(2*i-1);star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower half
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int star = 3;star<=(2*i-1);star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
