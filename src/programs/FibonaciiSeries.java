package programs;

public class FibonaciiSeries {

	static int n1 = 0, n2 = 1, n3 = 0;
	public static void fibo(int n){
		
		if(n>0){
			n3 = n1+n2;
			System.out.print(n3 +" ");
			n1 = n2;
			n2=  n3;
			fibo(n-1);	
		}
	}
	
	public static void fiboNormal(int n){
		int n1 = 0, n2 = 1, n3;
		
		System.out.print(n1 +" "+n2);
		
		for(int i = 2; i<n; i++){
			n3 = n1+n2;

			System.out.print(" "+ n3);
			n1= n2;
			n2= n3;
			
		}
		
	}
	
	public static void fiboWhileLoop(int n){
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.println();
		while(n>0){
			n3 = n1+n2;
			System.out.print(n3+ " ");
			n1 = n2;
			n2 = n3;
			n=n-1;
		}
		
	}
	
	public static void main(String[] args) {
		fiboNormal(18);
		System.out.println();
		fibo(18);
		fiboWhileLoop(18);
		
		
	}

}
