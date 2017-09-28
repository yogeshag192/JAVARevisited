
public class StringMemoryCheck {

	public static final int blankfinalvariable;
	public StringMemoryCheck()  {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		this.add();
		
		
	}
	
	public StringMemoryCheck(final int a){
		
		System.out.println("parameterised constructor called.. " +a);
	}
	
	public void add()  {
		System.out.println("Add Method Called..");
	
	}
	static{
		System.out.println("Static block invoked..");
		blankfinalvariable = 1083;
		
	}
	public static final void main(String[] args) {
		StringMemoryCheck st = new StringMemoryCheck(2);
		
	}
	

}
