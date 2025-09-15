package operators;

//a++ -- postfix
//++a -- prefix
public class Operators {

	public static void main(String[] args) {
		
		int a=10,b=20,sum=0;
		sum=a+b;
		System.out.println("sum="+sum);
		System.out.println("sum="+(a+b));
		System.out.println("sum="+(a-b));
		System.out.println("sum="+(a/b));
		System.out.println("sum="+(a*b));
		System.out.println("a++="+a++);
		System.out.println("a--="+a--);
		System.out.println(a);
	}
	
}
