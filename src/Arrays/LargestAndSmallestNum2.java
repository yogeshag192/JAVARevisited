package Arrays;

public class LargestAndSmallestNum2 {
	
	
	int secondSmallest;
	
	public void findLargestAndSmallest(int a[]){
		int max = a[0];
		int min = a[0];
		int secondLargest=0;
		
		
		
		for(int i : a){
			
			if(i>max){
				secondLargest = max;
				max = i;
			}
			else if(i>secondLargest){
				secondLargest = i;
			}
			
		}
		
		System.out.println("Largest: " +max);
		//System.out.println("Smallest: " +min);
		System.out.println("secondLargest: " +secondLargest);
		//System.out.println("secondSmallest: " +secondSmallest);
	}

	public static void main(String[] args) {
	
		int a[] = {-2,4,6,75,78,64,54,79,8,6,0,2,-1,26,100,99};
		new LargestAndSmallestNum2().findLargestAndSmallest(a);

	}

}
