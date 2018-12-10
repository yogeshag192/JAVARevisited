import java.util.Scanner;

public class ArmstrongNumber2 {
	
	int num;
	int y;
	public ArmstrongNumber2(int num){
		this.num = num;
	}
	
	
	public void checkArmstrongOrNot(){
		
		String text = String.valueOf(num);
		for (int i = 0; i <text.length(); i++){
			String s = String.valueOf(text.charAt(i));
			int value = Integer.parseInt(s);
			value = value*value*value;
			y = y + value;
			
		}
		System.out.println("Sum of Cube of digits is : " +y);
		if(y == num){
			System.out.println(+num+ " is an armstrong number..");
		}
		else{
			System.out.println(+num+ " is not an armstrong number!");
		}
		
	}

	public static void main(String[] args) {

			int inputNum = 0;
			System.out.println("Enter the input number: ");
			Scanner sc = new Scanner(System.in);
			inputNum = sc.nextInt();
					
			
			System.out.println("Input Number given is : " +inputNum);
			ArmstrongNumber2 obj = new ArmstrongNumber2(inputNum);
			obj.checkArmstrongOrNot();
			
			
	}
	
	// 153, 370, 371,407, 1634, 8208, 9474, 54748

}
