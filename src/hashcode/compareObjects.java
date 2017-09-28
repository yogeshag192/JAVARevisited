package hashcode;

public class compareObjects extends Object {
	public String y;
	
	compareObjects(String b){
		//super();
		y = b;
	}
	
	public boolean equals(Object o){
		if(o.hashCode() == this.hashCode()){
			
		return true;
		}
		else
			return false;
	}
	
	public int hashCode(){
		
		return this.y.hashCode();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		compareObjects obj1 = new compareObjects ("Yoge");
		compareObjects obj2 = new compareObjects ("Yoge");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		
	}

}
