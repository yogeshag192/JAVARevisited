package programs;

import java.util.Arrays;

public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		int a[] = {36,5,4,6,7,9,0,2,2,35,34};
		int largest = a[0];
		int secondLargest = a[0];
		int secondSmallest = a[0];
		int smallest = a[0];
		
		for (int i = 0; i<a.length; i++){
			
				if (a[i]> largest){
					secondLargest = largest;
					largest = a[i];
				}
				else if(a[i]>secondLargest){
					secondLargest = a[i];
					
				}
				
			}
			
			
		
	
		
		System.out.println("Largest Number is : = " +largest);
		System.out.println("Second Largest Number is : = " +secondLargest);
		System.out.println("Smallest Number is : = " +smallest);
		System.out.println("Second Smallest Number is : = " +secondSmallest);
	}

}
