package interfaceTest;

public class TestInterface implements Interface2, Interface1 {

	@Override
	public void add() {
		multiply();
		
	}
	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		Interface1.super.multiply();
	}
	public static void main(String[] args) {
		

		
		Interface1 a = new TestInterface();
		a.add();
		
	}

	


}
