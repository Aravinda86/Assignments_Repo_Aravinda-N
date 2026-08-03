package weeklyassignments;

import java.util.Arrays;

public class Program16_Anagram_Check {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";
		char s1[] = new char[str1.length()];
		char s2[] = new char[str2.length()];
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		str1= str1.trim();str2= str2.trim();
		if(str1.length() != str2.length()) {
			System.out.println("Not Anagram");
		}
		else {
		for(int i=0;i<str1.length();i++) {
			s1[i] = str1.charAt(i);
			s2[i] = str2.charAt(i);
		}
		Arrays.sort(s1); Arrays.sort(s2);
		if(Arrays.equals(s1, s2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		}
	}

}
