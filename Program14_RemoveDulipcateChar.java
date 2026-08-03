package weeklyassignments;

public class Program14_RemoveDulipcateChar {

	public static void main(String[] args) {

		String str ="Programming";
		String result =" ";
		
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
				if(result.indexOf(c) == -1) {
					result = result + c;
				}
		}
		System.out.println(result.toString());
		
	}

}
