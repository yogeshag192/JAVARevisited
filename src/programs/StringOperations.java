package programs;

public class StringOperations {

	public static void main(String[] args) {
		String URL = "http://localhost:7001/facebook.com";
		String newurl1 = URL.substring(7);
		System.out.println(newurl1);
		String[] host = newurl1.split(":");
	
		for (int i = 0; i< host.length; i++){
			System.out.println(host[i].toString());
		}
	}

}
