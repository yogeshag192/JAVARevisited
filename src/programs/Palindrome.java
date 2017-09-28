package programs;

public class Palindrome {

	
	public static void numberPalindromeOrNot(int n){
		int Original = n;
		int reverse = 0 ;
		int remainder;
		while(n>0){
			
			remainder = n%10;
			reverse = reverse *10 + remainder;
			n = n/10;
		}
		System.out.println("reverse is: " +reverse);
		if (reverse==Original){
			System.out.println("Number is Palindrome Number!");
		}
		else {
			System.out.println("Number is not Palindrome Number");
		}
	}
	
	public static void stringPalindromeOrNot (String str){
		String reverseString = "";
		for(int i = str.length()-1; i>=0; i--){
		char ch = str.charAt(i);
		reverseString = reverseString + ch;
		
		}
		System.out.println("Reverse of given string is: " +reverseString);
		if (reverseString.equals(str)){
			System.out.println("String is Palindrome String!");
		}
		else {
			System.out.println("String is not Palindrome String");
		}
	}
	
	public static void main(String[] args) {
		
		numberPalindromeOrNot(1255221);
		stringPalindromeOrNot("BentneB");
	}

}
