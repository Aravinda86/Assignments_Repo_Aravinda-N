package dailyassignments;

public class Program4_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1239456;
		int large =0;
		int temp = num;
		int largest =0;
		
		while(num>0) {
			int modNum = num%10;
			if(modNum > largest) 
				largest = modNum;
			num = num/10;
		}
		System.out.println("The largest number is:"+ largest);
	}

}
