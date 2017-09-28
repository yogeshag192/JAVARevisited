package Strings;

public class ReplaceFirstOccournce {

	public static void main(String[] args) {
		
		String input = "thethetheabctheabc";
		String newString = input.replaceFirst("the", "HHH");
		System.out.println(newString);
		
		for (int i = 0; i<input.length(); i++){
			if (input.charAt(i) == 'a'){
				String new1 = input.replace(input.charAt(i), 'N');
				System.out.println(new1);
				break;
			}
			
		}
	}

}
