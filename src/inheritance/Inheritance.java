package inheritance;
//class Parent 
//{
//	String name;
//	void display()
//	{
//		System.out.println("parent class method");
//	}
//}
//class Child extends Parent 
//{
//	void display1()
//	{
//		System.out.println("child class method");
//	}
//}

public class Inheritance {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.display();
		c.display1();	
		c.name="riya";
		System.out.println("name="+c.name);
	}
}


//vehicle --- name,modelno 
//car -- color,price  void drive ()