package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindCommonElementsInThreeArrays {
	List<Integer> list = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();
	
	public void findCommons(Integer a[], Integer b[], Integer c[]){
		
		list = Arrays.asList(c);
		for (int i = 0; i < a.length; i++) {
				if(list.contains(a[i])){
					list2.add(a[i]);
					
				}
		}
		for (int i = 0; i < b.length; i++) {
			if(list.contains(b[i])){
				list2.add(b[i]);
				}
			}
		
		
		HashSet set1 = new HashSet<>();
		set1.addAll(list2);
		list2.clear();
		list2.addAll(set1);
		
		System.out.println("Given Arrays: \n" +Arrays.toString(a) +"\n"+ Arrays.toString(b) +"\n"+ Arrays.toString(c));
		System.out.println("Common Elements in arrays: " +list2.toString());
		
		}

	public static void main(String[] args) {
		
		
		Integer [] a = {1, 5, 10, 20, 40, 80, 120};
		Integer [] b = {1, 6, 7, 20, 80, 100, 120};
		Integer [] c = {1, 3, 4, 15, 20, 30, 70, 80, 120};
		new FindCommonElementsInThreeArrays().findCommons(a, b, c);
		

	}

}
