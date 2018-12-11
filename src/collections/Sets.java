package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class Sets {
	
	
	public static void HashSet(){
		System.out.println("Hash set");
		Set <Object> set = new HashSet<Object>();
	
	for( int i = 0; i<5; i++){
		set.add(i + " Name" +i);
	}
	set.add(null);
	set.add("1 Name1");
	
	Iterator<Object> it = set.iterator();
	while(it.hasNext()){
		String value = (String)it.next();
		System.out.println(value);
		//set.add("new"); ConcurrentModificationException
			
		}
	}
	
	
	public static void TreeSet(){
		System.out.println("Tree set");
		Set<String> set1 = new TreeSet<String>();
		for( int i = 0; i<5; i++){
			set1.add(i + " Name" +i);
		}
	
		
		//set1.add(null); java.lang.NullPointerException
		set1.add("1 Name1");
		
		Iterator<String> it = set1.iterator();
		while(it.hasNext()){
			String value = (String)it.next();
			System.out.println(value);
		}
	}
	
	
	public static void LinkedHashSet(){
		System.out.println("Linked hash set");
		Set<Object> set2 = new LinkedHashSet<Object>();
		for( int i = 0; i<5; i++){
			set2.add(i + " Name" +i);
		}
		set2.add(null);
		set2.add("1 Name1");
		
		
		Iterator<Object> it = set2.iterator();
		while(it.hasNext()){
			String value = (String)it.next();
			System.out.println(value);
		}
	}

	public static void main(String[] args) {

		HashSet();
		System.out.println();
		TreeSet();
		System.out.println();
		LinkedHashSet();
		
	}

}
