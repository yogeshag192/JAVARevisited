package TSYS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookTest {

	public static void main(String[] args) {

		
	Set<Book> set1 = new HashSet<Book>();
	List<Book> list1 = new ArrayList<Book>();
		
		/*set1.add(new Book("abc" , "xyz"));
		set1.add(new Book("abc" , "xyz"));
		set1.add(new Book("abc" , "xyz"));
		System.out.println(set1.size());
		
		Iterator<Book> it = set1.iterator();
		while (it.hasNext()){
			System.out.println(it.next().hashCode());*/
			
		
		
		Book b1 = new Book ("abc", "xyz");
		Book b2 = new Book ("abc", "xyz");
		Book b3 = new Book ("abc2", "xyz2");
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b1.author==b2.author);
		System.out.println(b1.equals(b2));
		
		//System.out.println(b1.equals(b2));
		/*System.out.println(list1.add(b1));
		System.out.println(list1.add(b2));
		System.out.println(list1.add(b3));
		System.out.println(list1.add(b1));
		
		Iterator<Book> it = list1.iterator();
		while (it.hasNext()){
			System.out.println(it.next().author + " " +it.next().bookName);
			}
		
		System.out.println(list1.size());*/
		
		
		Map<Book, Book> map1 = new LinkedHashMap<Book, Book>();
		map1.put(b1, b1);
		map1.put(b2, b2);
		map1.put(b3, b3);
	
		
		list1.add(b1);list1.add(b2);list1.add(b3);
		set1.add(b1);set1.add(b2);set1.add(b3);
		
		/*for (Map.Entry<Book, Book> entry: map1.entrySet()){
			System.out.println(entry.getKey().author + " " +entry.getValue().bookName);
		}*/
		System.out.println(map1.size());
		System.out.println(list1.size());
		System.out.println(set1.size());
		
	}

}
