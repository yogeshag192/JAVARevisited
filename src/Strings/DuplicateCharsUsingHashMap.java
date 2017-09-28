package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsUsingHashMap {
	public static void printDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();

        // build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        // Iterate through HashMap to print all duplicate characters of String
        //Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        
        System.out.println("List of duplicate characters in String:" + word);
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()+ " : " + entry.getValue());
            }
        }
    }
	
	public static void main(String args[]) {
        printDuplicateCharacters("Programmming");
        printDuplicateCharacters("Combination");
        printDuplicateCharacters("Java");
    }
}
