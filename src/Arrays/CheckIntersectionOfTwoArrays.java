package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIntersectionOfTwoArrays {

	
	public static void checkIntersection(Integer[] a , Integer[] b){
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
	
		if(a.length>b.length){
			list = Arrays.asList(a);
			
			for (int i = 0; i<b.length; i++){
				if (list.contains(b[i])){
					list2.add(b[i]);
				}
			}
		}
		else if(a.length<b.length){
			list = Arrays.asList(b);
			for (int i = 0; i<a.length; i++){
				if (list.contains(a[i])){
					list2.add(a[i]);
				}
			}
		}
		
		System.out.println("Intersection of two arrays is := " +list2);
		
			
		}
		
		
	public static void main(String[] args) {
	
		
		
		Integer a[] = {2,3,4,5,6,7,8};
		Integer b[] = {1,2,3,4,5,6};
		
	
		
		checkIntersection(a,b);
	}

}
