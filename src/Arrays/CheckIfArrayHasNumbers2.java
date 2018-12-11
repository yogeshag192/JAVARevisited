package Arrays;

import java.util.Arrays;

public class CheckIfArrayHasNumbers2 {
	
	private static void checkIfArrayHasNumbers(Object[] a) {
	
			for (int i = 0; i < a.length; i++) {
				if(a[i].getClass().getSimpleName().equalsIgnoreCase("Integer")){
					System.out.println("Array contains Number: " +a[i]);
				}
			}
		
	}
	
	private static void checkIfArrayHasNumbersUsingCollections(Object[] a){
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Integer);
			System.out.println("Array contains this Number:" +a[i]);
		}
	}


	public static void main(String[] args) {
	
		
		Object a[] = {"abc", 1,2,"ghj",new StringBuilder(),5};
			checkIfArrayHasNumbers(a);
			checkIfArrayHasNumbersUsingCollections(a);

	}

	
}
