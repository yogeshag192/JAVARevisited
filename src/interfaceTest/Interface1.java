package interfaceTest;

public interface Interface1 {

	 int a= 5;
	 int b = 5;
	 void add();
	 default void multiply(){
		 System.out.println(a + b);
	 }
	
	  
}
