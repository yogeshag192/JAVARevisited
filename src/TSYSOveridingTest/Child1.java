package TSYSOveridingTest;

public class Child1 extends Parent1 {
	public String str1 = "Child";
	public static String str2 = "Static Child";
	
	protected void method1(){
		System.out.println("Child non static method");
	}
	
	
	protected static void method2(){
		System.out.println("Child static method");
	}

}
