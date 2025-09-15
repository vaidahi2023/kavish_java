package operators;

//&&,||,!
public class Logical {

	public static void main(String[] args) {
		
		int a=10,b=20;
		System.out.println("a<b && a==20="+(a<b&& a==20));
		System.out.println("a<b && a==10="+(a<b&& a==10));
		System.out.println("a<b || a==20="+(a<b || a==20));
		System.out.println("a<b && a==20="+(a>b || a==20));
		System.out.println("a<b="+!(a<b));
		
	}
}
