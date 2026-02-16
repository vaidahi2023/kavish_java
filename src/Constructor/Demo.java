package Constructor;

public class Demo {

	private int a,b;
	//default constructor 
	Demo()
	{
		System.out.println("default constructor");
	}
	//parmeterized constructor
	Demo(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("it is parameterized constructor");
	}
	
	//copy constructor
	Demo(Demo d)
	{
		this.a=d.a;
		this.b=d.b;
		System.out.println("it is copy constructor");
		
	}
	public static void main(String[] args) {
		
		Demo d=new Demo();
		Demo d1=new Demo(12,13);
		System.out.println("a="+d1.a);
		System.out.println("b="+d1.b);
		
		Demo d2=new Demo(d1);
		
		System.out.println("a="+d2.a);
		System.out.println("b="+d2.b);
		
	}
	
}



