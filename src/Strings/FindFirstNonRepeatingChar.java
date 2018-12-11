package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {
	
	public static void findFirstNonRepCharUsingLinkedHashMap(String str){
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char r = 0;
		for (char ch: str.toCharArray()){
			if (map.containsKey(ch)){
				map.put(ch, map.get(ch) + 1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			if (entry.getValue()==1){
				r = entry.getKey();
				System.out.println("First Non Repeating Char from string " +str +" is: = " +r);
				break;
			}
		}
		throw new RuntimeException("No Non Repeating chars found:");
	}

	
	
	public static void findFirstNonRepCharUsingHashMap(String str){
		Map <Character, Integer> map = new HashMap<Character, Integer> ();
		
			for (char ch : str.toCharArray()){
				//map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
				if(map.containsKey(ch)){
					map.put(ch, map.get(ch)+1);
				}
				else{
					map.put(ch, 1);
				}
					
			}
			
			for (int i = 0; i < str.length(); i++){
				char c = str.charAt(i);
				if (map.get(c) == 1){
					System.out.println("First Non Repeating char is: " +c);
					break;
				}
				
			}
	
	}
		
		public static void usingStringIndexOf(String word){
			for(int i=0;i<word.length();i++){
				if(word.indexOf(word.charAt(i))== word.lastIndexOf(word.charAt(i))){
				System.out.println("non rep chars are:= " +word.charAt(i));
				}
				}
		}
		
		
	
	public static void main(String[] args) {
		
		//findFirstNonRepCharUsingLinkedHashMap("YYooggeessh");
		//findFirstNonRepCharUsingHashMap("YYooggeesshh");
		
		findFirstNonRepCharUsingHashMap("YYooaggeebsshhYa");
		
	}

}
