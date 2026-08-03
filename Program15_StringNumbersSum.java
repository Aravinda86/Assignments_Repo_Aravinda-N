package weeklyassignments;

public class Program15_StringNumbersSum {

	public static void main(String[] args) {

		String str ="10,20,30,40";
		String num[] = str.split(",");
		int sum = 0;
		for(int i=0;i< num.length;i++) {
			sum += Integer.parseInt(num[i]);
		}
		System.out.println(sum);
	}

}
