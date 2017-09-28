package Arrays;

public class LargestAndSmallestNumber {

	static int secondSmallest;
	
	public static void findLargestAndSmallestNumber(int a[]){
		
		int max = a[0];
		int min = a[0];
		int secondLargest = a[0];
		
		
		for (int n : a){
			if (n > max){
				secondLargest = max;
				max = n;
			}
			else if(n > secondLargest){
				secondLargest = n;
				
			}
			
			else if(n<min){
				secondSmallest = min;
				min = n;
			}
			
			/*else if(n< secondSmallest){
				secondSmallest = n;
			}*/
		}
		
		System.out.println("Largest : = " +max);
		System.out.println("Second Largest : = " +secondLargest);
		System.out.println("Smallest : = " +min);
		System.out.println("Second Smallest : = " +secondSmallest);
		
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {2,5,6,4,7,89, 85, 1,2,86,0};
		findLargestAndSmallestNumber(a);

	}

}
