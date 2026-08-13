package weeklyassignments;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Program22_FirstNonRepeatingWord {

	public static void main(String[] args) {

		String str = "Swiss";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(map.get(ch)==1) {
				System.out.println(ch);
			break;
			} 
			}
		}
	}
