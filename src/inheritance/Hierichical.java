package inheritance;
class Vehicle 
{
	void display()
	{
		System.out.println("it is vehicle class");
	}
}
class Car extends Vehicle 
{
	void display1()
	{
		System.out.println("it is car class");
	}
}
class Bicycle extends Vehicle 
{
	void display2()
	{
		System.out.println("it is bicycle class");
	}
}

public class Hierichical {
	
	public static void main(String[] args) {
	
		Car c=new Car();
		c.display();
		c.display1();
		Bicycle b=new Bicycle();
		b.display();
		b.display2();
	}
}
