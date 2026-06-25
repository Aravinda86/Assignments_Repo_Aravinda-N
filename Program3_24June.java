package dailyassignments;

import java.util.Scanner;

public class Program3_24June {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Student Total Marks obtained to find the grade");
		int totalMarks = scanner.nextInt();
		
		if(totalMarks>=90 && totalMarks<=100) 
			System.out.println("Congratulation!, You Scored Grade A");
		
		else if(totalMarks>=75 && totalMarks<=89) 
			System.out.println("Congratulation!, You Scored Grade B");
		
		else if(totalMarks>=60 && totalMarks<=74) 
			System.out.println("You Scored Grade C ");
		
		else if(totalMarks>=40 && totalMarks<=59) 
			System.out.println("You Scored Grade D");
		
		else
			System.out.println("You Failed, Please Try Again");
		
	}

}
