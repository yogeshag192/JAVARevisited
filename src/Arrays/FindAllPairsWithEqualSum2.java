package Arrays;

import java.util.Arrays;

public class FindAllPairsWithEqualSum2 {
	static int a[] = new int [15];
	
	public static void generateRandomArray(){
		for (int i = 0; i <a.length; i++) {
			
			a[i] = (int) (Math.random()*15);
			
		}
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void findAllPairsArray(int num){
		generateRandomArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]+a[j]==num && a[i]!=a[j]){
					System.out.println("pair is {" +a[i] +":" +a[j] +"} and sum is: " +num );
				}
			}
		}
	}

	public static void main(String[] args) {

		
		findAllPairsArray(9);
		

	}

}
