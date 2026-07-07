package weeklyassignments;

public class Program8_FrequesyOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4, 5, 6, 3, 4, 5};
		int count;
		
		for(int i=0; i<arr.length;i++) {
			boolean flag = false;
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag) 
				continue;
			count = 1;
			
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i]== arr[j]) {
					count++;
				}
			}
			
			System.out.println(arr[i]+ "occurs"+ count +"times");
		}
		
	}

}
