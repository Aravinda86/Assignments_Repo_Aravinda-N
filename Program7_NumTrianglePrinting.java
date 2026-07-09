package dailyassignments;

public class Program7_NumTrianglePrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i;k++) {
				System.out.print(k);
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}
				
			System.out.println();
		}
	}

}
