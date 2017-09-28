package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	
	public static void removeDuplicateUsingList(int array[]){
		

		List list = new ArrayList();
		for (int i = 0; i <array.length ; i++){
			if (!list.contains(array[i])){
				list.add(array[i]);
			}
		}

		System.out.println(list.toArray());
	}

	
	
	public static void removeDuplicateWithoutCollections(int array[]){
		int newArray[] = new int [array.length];
		
		Arrays.sort(array);
	
		newArray[0] = array[0];
		
		for (int i = 1; i<array.length; i++){
			int ch = array[i];

				if (previous!= ch){
					newArray[i] = ch;
				}
				previous = ch;
		}
		
		for(int k : newArray){
			System.out.print(k + " ");
		}
		
		
	}
	
	public static void main(String[] args) {

		int a[] = {1,2,3,1,5,7,1,9,2};
		removeDuplicateUsingList(a);
		removeDuplicateWithoutCollections(a); //working
	}

}
