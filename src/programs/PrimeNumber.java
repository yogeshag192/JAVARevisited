package programs;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrimeNumber {

	
	
	public static void checkPrimeOrNot(int n) throws UnknownHostException{
		Boolean flag = true;
		for(int i = 2; i < n/2; i++){
			if(n%i == 0){
				System.out.println("Number is not prime!");
				flag = false;
				break;	
			}
		}
		if (flag == true){
			System.out.println("Number is prime!");
		}
		System.out.println(InetAddress.getByName("172.27.218.15").getHostName());
	}
	public static void main(String[] args) throws UnknownHostException {
		
		checkPrimeOrNot(17);
	}

}
