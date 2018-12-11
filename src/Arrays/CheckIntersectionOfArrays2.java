package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIntersectionOfArrays2 {

		static List newList = new ArrayList<Integer>();
		
	public static void checkIntersection(int a[], int[]b){
		String firstArray = Arrays.toString(a);
		for (int i = 0; i < b.length; i++) {
			if(firstArray.contains(String.valueOf(b[i]))){
				newList.add(b[i]);
			}
		}
		System.out.println("Intersection of two arrays: " + newList.toString());
	}
	
	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7};
		int b[] = {1,2,3,6,7};
		checkIntersection(a,b);

	}

}
