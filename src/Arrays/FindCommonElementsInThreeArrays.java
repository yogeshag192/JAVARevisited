package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonElementsInThreeArrays {
	List<Integer> list = new ArrayList<Integer>();
	
	public void findCommons(Integer a[], Integer b[], Integer c[]){
	int size = Math.max(a.length, Math.max(b.length, c.length));
	if(a.length == size){
		list= Arrays.asList(a);
	}
	else if(b.length == size){
		list = Arrays.asList(b);
	}
	else{
		list = Arrays.asList(c);
	}
	}

	public static void main(String[] args) {
		
		
		Integer [] input1 = {1, 5, 10, 20, 40, 80};
		Integer [] input2 = {6, 7, 20, 80, 100};
		Integer [] input3 = {3, 4, 15, 20, 30, 70, 80, 120};
		

	}

}
