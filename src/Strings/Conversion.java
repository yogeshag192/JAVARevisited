package Strings;

public class Conversion {

	public static void main(String[] args) {
	
		
			//String to integer
			String s1 = "12345";
			int n = Integer.parseInt(s1);
			System.out.println(n);
			
			//Integer to String
			String s = Integer.toString(n);
			System.out.println(s);
			
			s = String.valueOf(5555);
			System.out.println(s);
			
			String s2 = String.format("%d", 1269);
			System.out.println(s2);
			
		

	}

}
