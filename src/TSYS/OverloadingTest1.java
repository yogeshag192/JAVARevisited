package TSYS;

public class OverloadingTest1 {

		/*public static void test(Object o){
			System.out.println("Object");	
		}*/
		
		public static void test(Long l){
			System.out.println("Long");	
		}
		
		public static void test(long l){
			System.out.println("long primitive");	
		}
		
		
		public static void test(int i){
			System.out.println("int primitive");	
		}
		
		public static void test(Integer i){
			System.out.println("Integer");	
		}
	
	public static void main(String[] args) {
	
		test(1);
		test(new Integer(1));
		test(new Long(1));
		test(1L);
		/*test(new String("str"));
		test(null);
*/
	}

}
