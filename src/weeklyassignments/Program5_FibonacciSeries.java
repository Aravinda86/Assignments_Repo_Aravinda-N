package weeklyassignments;

public class Program5_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		int b = 1;
		int c = 0;
		
		System.out.print(a +" "+ b+" ");
		int count = 10;
		count = count- 2;
		
		for(;count>0;count--) {
			c= a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
