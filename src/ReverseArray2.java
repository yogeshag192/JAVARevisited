import java.util.Arrays;

public class ReverseArray2 {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5};
		int b[] = new int[a.length];
		System.out.println("Given Array is: " +Arrays.toString(a));
		
		
		int count = a.length-1;
		for (int i = 0; i< a.length; i++){
				
				b[count] = a[i];
				count--;
				//System.out.println("Current count value: " +count + " and i value: " +i);
				
			
			
		}
		
		System.out.println("Reverse array is: " +Arrays.toString(b));
	}

}
