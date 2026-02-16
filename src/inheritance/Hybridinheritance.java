package inheritance;
//multilevel+multiple
interface X 
{
	void show();
}
interface Y 
{
	void show1();
}
class D implements X,Y
{	
	public void show1() {
	
			System.out.println("it is y interface method");
	}
	public void show() {
		
		System.out.println("it is x interface method");
	}
}
class D1 extends D 
{
	void display()
	{
		System.out.println("it is child class method");
	}
}
public class Hybridinheritance {

	public static void main(String[] args) {
		
		D1 d=new D1();
		d.display();
		d.show();
		d.show1();
	}
}
