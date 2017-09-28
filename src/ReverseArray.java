import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] a = {4,5,6,3,7,9};
		String arraystring = Arrays.toString(a);
		System.out.println(arraystring);
		ArrayList<Object> list1 = new ArrayList<Object>(Arrays.asList(a));
		
		for (int i = a.length-1; i>=0; i--){
			list1.add(a[i]);
		}
		
		Iterator<Object> it = list1.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}

	}

}
