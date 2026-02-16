package inheritance;

class GrandParent 
{
	void display()
	{
		System.out.println(" grand parent class method");
	}
}
class Parent extends GrandParent
{
	void display1()
	{
		System.out.println("parent class method");
	}
}
class Child extends Parent 
{
	void display2()
	{
		System.out.println("child class method");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.display();
		c.display1();
		c.display2();
		
	}
}

animal -- void eat()
dog -- color,food
puppy -- name,age












