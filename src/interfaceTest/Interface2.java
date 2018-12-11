package interfaceTest;

public interface Interface2{
	int a= 10;
	 int b = 8;
	 
	 void add();
	 default void multiply(){
		 System.out.println(a + b);
	 }


}
