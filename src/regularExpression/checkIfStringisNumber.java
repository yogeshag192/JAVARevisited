package regularExpression;

import java.util.regex.Pattern;

public class checkIfStringisNumber {

	public static void main(String[] args) {

		
		String str = "abc";
		Pattern p = Pattern.compile(".*[^0-9].*"); //match numbers in string
		Pattern digitP = Pattern.compile("\\d{6}"); //match digit count in string or char sequence
		
		System.out.println(p.matcher(str).matches());
		System.out.println(digitP.matcher("1234").matches());
	}

}
