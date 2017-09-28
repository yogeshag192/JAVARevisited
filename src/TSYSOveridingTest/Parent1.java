package TSYSOveridingTest;

public class Parent1 {
	
	public String str1 = "Parent";
	public static String str2 = "Static Parent";
	
	protected void method1(){
		System.out.println("Parent non static method");
	}
	
	
	protected static void method2(){
		System.out.println("Parent static method");
	}
	 

}
