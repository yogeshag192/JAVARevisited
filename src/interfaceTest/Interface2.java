package interfaceTest;

public interface Interface2 extends Interface1{
	int a= 6;
	 int b = 8;
	 
	default void add(){

		System.out.println(a+b);
	
	}


}
