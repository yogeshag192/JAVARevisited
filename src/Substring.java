
public class Substring {

	public static void main(String[] args) {
		
		
		
		String a = "$1000.46";
		String url = "www.weblogic.com:3000:4000";
		String b = a.substring(1,a.length());
		System.out.println(b);
		//int x = Integer.parseInt(b);
		//System.out.println(x);
		
		
		String c = url.substring(url.indexOf(":"));
		System.out.println(c);
		
		System.out.println(url.substring(url.lastIndexOf(":")));
		

	}

}
