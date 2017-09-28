package Arrays;

public class CheckIfArrayContainsNumber {

	public static void checkIfArrayhasNumbers(Object a[]){
		
		for (int i = 0; i<a.length; i++){
			if (a[i].getClass().getSimpleName().equalsIgnoreCase("Integer")){
				System.out.println("Array has number: " + a[i]);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Object a [] = {"abc" , "xyz" , 3,4,"ghijno"};
		checkIfArrayhasNumbers(a);
		
	}

}
