package Arrays;

import java.util.Arrays;

public class FindAllPairsWhoseSumIsEqual {
	
	public static void findPairs(int a[], int num){
		
		System.out.println("Given Array: "+ Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]+a[j] == num && a[i]!=a[j]){
					System.out.println("Pair is : {" +a[i]+ " , " +a[j] +"} ,Sum = " +num);
				}
				
			}
		}
	}
	
	
	public static int[] generateRandomArray(){
		int Random[] = new int[15];
		for (int i = 0; i < Random.length; i++) {
			Random[i] = (int) (Math.random()*15);
		}
		
		return Random;
	}

	public static void main(String[] args) {
		int a[] = {5,6,2,3,4,1,7,8,0,10,-2};
		findPairs(generateRandomArray(), 7);
		

	}

}
