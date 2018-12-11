package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class CountNumberOfOccourancesInArray {
	 
	public static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public static void countNumberOfOccourances(int a[]){
	
		for(int i : a){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}
			else{
				map.put(i, 1);	
			}
		}
		//printing map values using entry set
		for (Map.Entry<Integer, Integer> entry: map.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//printing map values using iterator
		//Iterator it = (Iterator) map.entrySet().iterator();
		//map.forEach((key, value) -> System.out.println(key + " :: " +value));
		
		Set st = map.keySet();
		Iterator it = st.iterator();
		while(it.hasNext()){
			
			System.out.println("Key = " +it.next());
			
		}
	}
	

	public static void main(String[] args) {
	
		int a [] = {1,2,3,4,1,2,3,4,5,8};
		countNumberOfOccourances(a);


	}

}
