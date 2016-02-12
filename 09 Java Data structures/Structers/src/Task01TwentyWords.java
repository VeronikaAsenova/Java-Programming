

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
//

public class Task01TwentyWords {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 20 words: ");
			
		String[] words =  new String [20];
		for (int i = 0; i < words.length; i++) {
			words[i]=s.nextLine();
		}
		
	
		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
				
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count + 1);
		}
		
		Set<String> wordKeys = wordsCount.keySet();
		
		
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			System.out.println(word + " -> " + count + " times");
		}
		
	}
}
