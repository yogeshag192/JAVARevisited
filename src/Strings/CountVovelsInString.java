package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountVovelsInString {

	public static void findNoOfVovelsUsingSwitchCase(String str){
		int count = 0;
		char d = 0;
		
		for (char ch : str.toCharArray()){
			switch (ch){
			case 'a' :
				
			case 'e' :
			case 'i' :	
			case 'o' :
			case 'u' :
				count++;
				break;
				
			default : 
					
			}
		}
		
		System.out.println("No of vovels : = "+count);
}
	
	
	public static void findNoOfVovelsUsingIfElse(String str){
		for(int i = 0; i<str.length(); i++){
		
		if (str.contains("a"))
		System.out.println("vovel found is a ");
		
		if(str.contains("e"))
		System.out.println("vovel found is e");	
		
		if(str.contains("i"))
			System.out.println("vovel found is i");	
		
		if(str.contains("o"))
			System.out.println("vovel found is o");
		
		if(str.contains("u"))
			System.out.println("vovel found is u");	
	}
	}
		
	
	public static void findNoOfVovelsUsingHashMap(String str){
		char v = 0;
		char vol[] = {'a', 'e', 'i', 'o', 'u'};
		
		
		Map <Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char ch: vol){
			
			map.put(ch,0);
		
		}
		
		for (char c: str.toCharArray()){
			if(map.containsKey(c)){
				
				map.put(c, map.get(c) + 1);
				
				}
		}
		
		
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			
			if (entry.getValue()>=1){
				System.out.println("Vovel found is:= " +entry.getKey() +" and found " +entry.getValue() + " times");
			}
			
		}
		
	}
	
	public static void main(String[] args) {

		findNoOfVovelsUsingHashMap("abbibobuaeegge");

}
}
