package programs;

public class PrintPatterns{

	
	public void printStarTriangle(){
		for (int i=1; i<=6; i++){
			for (int j = 5; j>=i ;j--){
				System.out.print(" ");
			}
			for (int k = 0; k< (2*i-1); k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printNumberTriangle(){
		for (int i = 1; i<=6; i++){
			for (int j = 5;  j>=i ; j--){
				System.out.print(" ");
			}
			for (int k = 0; k<(2*i-1); k++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void printRightAngledTriangle(){
		for (int i = 1; i<=6; i++){
			for (int k = 0 ; k<(2*i-1); k++){
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
	
		PrintPatterns p = new PrintPatterns();
		p.printStarTriangle();
		p.printNumberTriangle();
		p.printRightAngledTriangle();
	}

}
