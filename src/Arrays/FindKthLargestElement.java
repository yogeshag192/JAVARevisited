package Arrays;

import java.util.PriorityQueue;

public class FindKthLargestElement {
	
	public static int findKthLargest(int[] nums, int k) {
	    int p = 0;
	    int numElements = nums.length;
	    // create priority queue where all the elements of nums will be stored
	    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

	    // place all the elements of the array to this priority queue
	    for (int n : nums){
	        pq.add(n);
	    }

	    // extract the kth largest element
	    while (numElements-k+1 > 0){
	        p = pq.poll();
	        k++;
	    }

	    return p;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		System.out.println(findKthLargest(a,3));

	}

}
