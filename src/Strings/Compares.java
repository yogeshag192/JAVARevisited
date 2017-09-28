package Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class Compares {

	
	public static String s = "abc";
	
	public static void main(String[] args) {


		 	String s1 = "abc";
			String s2 = new String("abc");
			String s3 = null;
			String s4 = new String("abcs");
			s4 = null;
			
			System.out.println(s4.equals(s1));
			System.out.println(s4 == s1);

			
			/*System.out.println(s1.equals(s3));
			System.out.println(s1.equals(s));
			System.out.println(s1 == s2);
			System.out.println(s1==s);
			
			System.out.println("List objects..");
			ArrayList list = new ArrayList();
			list.add(s1);
			list.add(s3);
			
			System.out.println(list.get(0)==list.get(1));
			System.out.println(list.get(0).equals(list.get(1)));
			System.out.println(list.add(s4));
			System.out.println(list.get(0).hashCode() + "   " +list.get(1).hashCode());
			System.out.println(s2.compareTo(s4));
			
			for(Object sl : list){
				System.out.println(s1.toString());
			}*/
	}

}
