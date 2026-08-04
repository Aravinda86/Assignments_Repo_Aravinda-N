package weeklyassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program18_FindMissingNumbers {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scanner.nextInt();
		
		while(true) {
			int n = scanner.nextInt();
			
			if(n == -1)
				break;
			
			list.add(n);
			
		}
		/*
		 * System.out.println("Enter the number value to limit the missing numbers:");
		 * num = scanner.nextInt();
		 */
		
				for(int i=1; i<= num; i++) {
					if(!list.contains(i)) 
					result.add(i);
		}
		System.out.println(result);
	}

}
