package Arrays;

import java.util.Arrays;

public class RemoveAnElementFromArray {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		int newArray[] = new int[a.length];
		int num = 4;
		
		for (int i = 0; i < a.length; i++) {
				
				if(a[i]!=num){
					newArray[i] = a[i];
				
			}
			
		}
		System.out.println(Arrays.toString(newArray));

	}

}
