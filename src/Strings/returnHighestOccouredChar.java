package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class returnHighestOccouredChar {

	
	public static void findHighestOccouredChar(String str){
		
		Map <Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()){
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		
		int maxValue = Collections.max(map.values());
		int minValue = Collections.min(map.values());
		for (Map.Entry<Character, Integer> entry : map.entrySet()){
			if (entry.getValue() == maxValue){
				System.out.println("Highest Occoured Char is: = " +entry.getKey() +" and it occoured " +entry.getValue() + " times");
			}
			if (entry.getValue()== minValue){
				System.out.println("Minimum Occoured Char is: = " +entry.getKey() +" and it occoured " +entry.getValue() + " times");
				
			}
		}
		
		
	}
	public static void returnHighestOccouredCharInList(String str){
		
		List<Character> list = new ArrayList<Character>();
		for (char ch : str.toCharArray()){
			list.add(ch);
		}
		
		for (char ch : str.toCharArray()){
		int count = Collections.frequency(list, ch);
		System.out.println(ch + " " +count);
		}
	}
	
	
	public static void main(String[] args) {
		
		findHighestOccouredChar("aaaaaaaaaaaaaaaaabbbbccddddeeeeee");
		System.out.println( "-----------------------------------" );
		returnHighestOccouredCharInList("aaaaaaaaaaaaaaaaabbbbccddddeeeeee");

	}

}
