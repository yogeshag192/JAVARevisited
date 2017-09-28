import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveElementFromArray {

	public static int[] removeElement (int[] array, int elementToRemove){
		int[] array1 = array;
		int index = findIndex(array1, elementToRemove);
		System.out.println("Index is : " +index);
		for (int j = index; j< array1.length-1; j++){
			array1[j] = array1[j+1];
		}
		
		return array1;
	}
	
	public static int findIndex(int[] array, int elementToFind){
		int index = 0;
		for(int i = 0; i<array.length; i++){
			
			if (array[i] == elementToFind){
				index  = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] a = {5,3,4,8,9};
		int[] newarray = removeElement(a, 9);
		System.out.println("New Array after removing: " +Arrays.toString(newarray));
	}
	
}
