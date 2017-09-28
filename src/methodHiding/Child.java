package methodHiding;

public class Child extends Parent {

	public void test(){
		System.out.println("Child class test method!");
	}
	public void test1(){
		System.out.println("Child Class Method..");
		test();
	}
	
	
	
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.test();
	}
}
