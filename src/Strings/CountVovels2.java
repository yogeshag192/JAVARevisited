package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountVovels2 {
	
	static HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
	
	public static void countVovelsUsingHashMap(String str){
		
		
		
		char vol [] = {'a' ,'e','i','o','u'};
		for (char c: vol){
			map1.put(c, 0);
		}
		
		
		for (char ch: str.toCharArray()){
				if (map1.containsKey(ch)){
					map1.put(ch, map1.get(ch) + 1);
					
				}
		}
		
		for(Map.Entry<Character, Integer> entry : map1.entrySet()){
			if(entry.getValue()>=1){
				System.out.println("Vovel found in string are :  " +entry.getKey() +" and found "                                     +entry.getValue() + " times");
			}
		}
		
		
		
	}
	public static void main(String[] args) {
	
		countVovelsUsingHashMap("aaeeeiiiiooooouuuuuuugdslfdsgjg543589");

		
	}

}
