package weeklyassignments;

public class Program7_DuplicatePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1 = {10,12,13,10,18,19};
		int[] num2 = {2,4,10,13,18,11};
		int[] num3 = new int[num1.length];
		int var = 0;
		boolean flag = false;
		
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num2.length;j++) {
				if(num1[i] == num2[j]) {
					flag = false;
					for(int k=0;k<var;k++) {
						if(num3[k]==num1[i] ) {
							flag = true;
							break;
						}
					
					}
					if(!flag) {
						num3[var] = num1[i];
						var++;
					}
				}
			}
		}
			for(int i=0;i<var;i++) {
				System.out.println(num3[i]);
			}
			//System.out.print(" "+ num3[i]);
			  
			
		 
	}

}
