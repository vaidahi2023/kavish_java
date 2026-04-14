package Polymoriphm;
class A 
{
	void fun()
	{
		System.out.println("it is parent class method");
	}
}
public class Polymoriphm1 extends A{
	
	void fun()
	{
		System.out.println("it is child class method");
	}

	public static void main(String[] args) {
		Polymoriphm1 p=new Polymoriphm1();
		p.fun();
		A a=new Polymoriphm1();
		a.fun();
	}
}
