import java.util.Arrays;

public class ReverseArrayUsingList {

	public static void main(String[] args) {
	
		
		int a[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		

		
		
		
		StringBuilder sr = new StringBuilder(Arrays.toString(a));
		sr.reverse();
		
		
		System.out.println("Reverse Array: " +sr.toString());
	

}
}
