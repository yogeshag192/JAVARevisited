package singleton;

public class Singleton {
	
	
	private static Singleton object;
	public static int objCount = 0;
	
	private Singleton(){
		System.out.println("Singleton: Private Constructor Invoked..!");
		objCount++;
		System.out.println("Current Object Count: "+objCount);
	}
	
	
	public static Singleton getInstance(){
		if (objCount <3){
			object = new Singleton();
			
		}
		return object;
	}

}
