
public class ArmstrongNumber {

	public static void main(String[] args) {
	
 		int a = 407; int y = 0;
 		//integer to string
		String text = String.valueOf(a);
		System.out.println(text);
		
		for(int i = 0; i<text.length(); i++){
			String s = String.valueOf(text.charAt(i));
			System.out.println("Current Value of s is: " +s);
			//String to integer
			int x = Integer.parseInt(s);
			x = x*x*x;
			System.out.println("Cube of x is: "+x);
			y = y+x;
			
		}
		System.out.println("Armstrong no of " + a +" is: " + y);

	}

}
