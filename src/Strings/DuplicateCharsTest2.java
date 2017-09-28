package Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharsTest2 {

	
	public static void dupCharUsingCharArray(String str){
		char ch[] = str.toCharArray();
		char d = 0;
		for (int i = 0; i < ch.length; i++){
			for (int j = i+1; j<ch.length; j++){
				
				if (ch[i]==ch[j]){
					d = ch[i];
					System.out.println("Duplicate character is:= " +d);
				}
			}
		}
		
	}
	
	
	public static void dupCharUsingString(String str){
			
		char d = 0;
		int count = 1;
		for (int i = 0; i <str.length(); i++){
			for (int j = i+1; j<str.length(); j++){
				if(str.charAt(i)==str.charAt(j)){
					d = str.charAt(i);
					count++;
					System.out.println("Duplicate character is:=" +d + "and count is: " +count);
				}
				count =1;
			}
		}
		
	}
	
	
	public static void dupCharUsingHashMap(String str){
		
		char charArray[] = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch: charArray ){
			 if (map.containsKey(ch)){
				 map.put(ch, map.get(ch) +1);
				 
			 }
			 else {
				 map.put(ch, 1);
			 }
		}

	
		for (Map.Entry<Character, Integer> entry: map.entrySet())
		{
			if (entry.getValue()>1){
				System.out.println("Duplicate character is:= " +entry.getKey() +" and found: " +entry.getValue() + " times.");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		dupCharUsingCharArray("yogeeshyeoo");
		

	}

}
