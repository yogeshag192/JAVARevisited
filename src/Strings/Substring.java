package Strings;

public class Substring {

	
	public static int searchStringInAnotherString(String str1, String str2){
		return str1.indexOf(str2);
		
	}
		
	
	public static void main(String[] args) {
		
		
		System.out.println(searchStringInAnotherString("gggggHelloggggg", "Hello"));
		
	}

}
