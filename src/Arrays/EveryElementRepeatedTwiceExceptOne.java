package Arrays;

import java.util.HashMap;
import java.util.Map;

public class EveryElementRepeatedTwiceExceptOne {

	
	public static void findSingleElement(int a[]){
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		for(int i : a){
			map.put(i, map.containsKey(i) ? map.get(i) +1 : 1);
			/*if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}
			else{
				map.put(i, 1);
			}*/
		}
		
		for (Map.Entry<Integer, Integer> entry: map.entrySet()){
			if(entry.getValue()==1){
				System.out.println("Single element is : " +entry.getKey());
			}
			else{
				System.out.println("Repeated elements are : " +entry.getKey() + " and repeating : " +entry.getValue() + " times");
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		
		int a[] = {1, 1, 2, 2, 2, 3, 4, 4, 5, 5};
		
		findSingleElement(a);

	}

}
