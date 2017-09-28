package TSYSOveridingTest;

public class TestClass1 {
	
	
	
	public static void main(String[] args) {
		Parent1 p = new Child1();
		System.out.println(p.str1);
		System.out.println(p.str2);
		
		
		p.method1();
		p.method2();
	}

}
