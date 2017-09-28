package Strings;

public class Literals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = "abc";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1==str2 );
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3) );
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1==sb2);
		
	}

}
