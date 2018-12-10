import java.util.Arrays;

public class RemoveElementWithoutUsingCollection {

	static int b[];
	public static int[] removeElement(int[] array, int elementToRemove){
		int array1[] = array;
		for (int i = 0; i <array1.length; i++) {
				
			int index = findIndex(array1,elementToRemove);
			//System.out.println("Element to remove is: " +elementToRemove +" at index: "+index);
			if (i == index){
				array1[i]=0;
				break;
			}
		}
		
		b= new int[array1.length-1];
		int count = 0;
		for (int i = 0; i <array1.length; i++) {
					if(array1[i]!=0){
						b[count] = array1[i];
						count++;
				}
			
			}
		
		return b;
		
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
		
		int a[] = {1,2,3,4,5};
		int c[] = removeElement(a,4);
		
		System.out.println("Given Array: " +Arrays.toString(a));
		System.out.println("Array After Element Removed: " +Arrays.toString(c));
		
		

	}

}
