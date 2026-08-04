package weeklyassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prorgam17_ListCommanElements {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		
		list1.add(1); list1.add(2); list1.add(3);list1.add(4);list1.add(5);
		list2.add(3); list2.add(4); list2.add(5); list2.add(6); list2.add(7);
		
		for(int num1 : list1) {
			for(int num2 : list2) {
				if(num1 == num2) {
					list3.add(num1);
				}
			}
		}
		
		for(int num : list3) {
			System.out.println(num);
		}
		
	}

}
