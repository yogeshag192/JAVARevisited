package Strings;

public class Replace {

	public static void main(String[] args) {

		
		String str = "Hello World";
		String str2 = str.replaceAll(" ", "%20");
		System.out.println(str2);
		str2 = str.replace(' ','H');
		
		System.out.println(str2);
		
		
		StringBuffer sb = new StringBuffer(str);
		sb.replace(1, 6, "JJJJ");
		System.out.println(sb);

	}

}
