package weeklyassignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program21_FileReadingandCounting {

	public static void main(String[] args) throws Exception {

		File file = new File("D:\\Java_Practices\\AssisgnmentFile.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		String str = " ";
		while((str = br.readLine())!=null) {		
			String[] line = str.split(" ");
			for(int i=0;i<line.length;i++){
			String word = line[i].toLowerCase();
			word = word.replaceAll("[^a-zA-Z]","");
			if(wordCount.containsKey(word)){
				wordCount.put(word, wordCount.get(word)+ 1);
			}else {
				wordCount.put(word, 1);
			}
			
			}
		}
		for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() +":" + entry.getValue());
		}
	}

}
