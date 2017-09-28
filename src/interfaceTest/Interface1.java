package interfaceTest;

public interface Interface1 {

	 int a= 5;
	 int b = 5;
	  default void add(){
		
		 System.out.println(a+b);
		 
	 }
	
	  
}
