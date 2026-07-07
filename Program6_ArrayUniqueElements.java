package weeklyassignments;

import java.util.Scanner;

public class Program6_ArrayUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num = {4,5,6,4,2,8,2};
		boolean flag = false;
	
		for(int i=0;i<num.length;i++) {
			flag = false;
			for(int j=0; j<i; j++) {
				if(num[i]== num[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(num[i]);
			}
		}
		
		
	}

}
