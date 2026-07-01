package weeklyassignments;

public class Profram4_FactorsOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 24;
		
		System.out.println("The factors of the "+ num + "is: ");
		for(int i=1; i<=num; i++) {
			if(num %i == 0)
				System.out.println(i);
		}
	}

}
