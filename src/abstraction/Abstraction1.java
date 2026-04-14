package abstraction;
//1.abstract class 2.interface
abstract class example
{
	abstract void print();
	void fun()
	{
		System.out.println("it is fun method");
	}
}
public class Abstraction1 extends example {

	void print()
	{
		System.out.println("it is parent class method");
	}
	public static void main(String[] args) {
		
		Abstraction1 a=new Abstraction1();
		a.print();
		a.fun();
	}
}