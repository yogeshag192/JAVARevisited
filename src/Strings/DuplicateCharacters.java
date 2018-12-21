package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class DuplicateCharacters {
	
	
	public static void findDuplicateUsingCharArray(String word){
		
		char ch[] = word.toCharArray();
		char d = 0;
		int count =0;
		for (int i = 0; i <ch.length; i++){
			for (int j = i+1; j<ch.length; j++){
				if (ch[i]==ch[j]){
					if(d!=ch[i]){
						count++;
						d = ch[i];
					 }
				}
				
			}
		}
		System.out.println("Duplicate character is : " +d);
		System.out.println("Number of character that is repeated : " +count);
	}

	public static void findDuplicateUsingStr(String word){
		int count = 1;
		char d = 0;
		for (int i = 0; i< word.length(); i++){
			for (int j = i+1; j<word.length(); j++){
				if(word.charAt(i)==word.charAt(j)){
					count++;
					
				}
			}
			
			if (count>0) {
				System.out.println("Duplicate character found: " +word.charAt(i) + " and count is: " +count);
			}
			count = 0;
			
		}
		
	}
	
	public static void findDuplicateUsingHashMap(String word){
		
		char chararray[] = word.toCharArray();
		Map <Character, Integer> map = new ConcurrentHashMap<Character, Integer>();
		
		for (char ch : chararray){
			if (map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}
			else{
				map.put(ch, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if (entry.getValue()>1){
				System.out.println("Duplicate character : = " +entry.getKey() + " and found " +entry.getValue() + " times");
				System.out.println("Removing duplicate Value : " +entry.getKey());
				map.remove(entry.getKey());
				
			}
			
			/*if (entry.getKey().equals("Y")){
				map.remove(entry.getKey());
				System.out.println("Value removed: " +entry.getKey());
			}*/
		}
		
		System.out.println(Collections.synchronizedMap(map));
		
		/*Iterator it = map.entrySet().iterator();
		//Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println("Key = " +it.next());
		}*/
		
		Iterator it1 = (Iterator) map.keySet().iterator();
		while(it1.hasNext()){
			char ch = (char) it1.next();
			System.out.println("Key = " +ch +" and Value = "+map.get(ch));
			map.put('H', 2);
		}
		
	}
	
	
	public static void main(String[] args) {
	
		findDuplicateUsingHashMap("yogeeshyeoo");
		/*System.out.println("=====================================");
		findDuplicateUsingStr("yogeeshyeoo");
		System.out.println("=====================================");
		findDuplicateUsingHashMap("yogeeshyeoo");
		*/
}
	
	
}


