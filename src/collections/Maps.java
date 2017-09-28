package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		
		Map<Object, Object> map = new HashMap<>();
		map.put(1, "One");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		
		Iterator<Object> it = map.keySet().iterator();
		while(it.hasNext()){
			Integer key = (Integer)it.next();
			String value = (String) map.get(key);
			System.out.println(key +" "+value);	
		}
		
		//another way to print hashmap contents
		System.out.println(Arrays.asList(map));
		System.out.println(Collections.singletonList(map));
		
	}

}
