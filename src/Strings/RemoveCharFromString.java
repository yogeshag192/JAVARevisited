package Strings;

public class RemoveCharFromString {

	public static void removeCharUsingCharArray(String str, char c){
		
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()){
			if (ch != c){
				sb.append(ch);
			}
		}
		System.out.println("String after removing char: = " +sb);
	}
	
	public static void main(String[] args) {
	
		
		removeCharUsingCharArray("abcdefgbh" , 'b');
		String str1 = "abcdefgbh";
		System.out.println(str1.replace('b', 'G'));
		

	}

}
