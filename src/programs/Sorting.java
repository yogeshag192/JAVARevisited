package programs;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		
		int a[] = {5,3,6,2,7,8,4,1,0};
		int temp = 0;
		for (int i =0; i<a.length; i++){
			for (int j = i+1; j<a.length; j++){
				if(a[i]>a[j]){
					
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array:  ");
		for (int k = 0; k<a.length; k++){
			System.out.print(a[k] +"\t");
		}
	}

}
