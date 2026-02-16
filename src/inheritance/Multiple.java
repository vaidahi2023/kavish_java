package inheritance;


interface A
{
	public void show();
	
}
interface B 
{
	public void display();
}
public class Multiple implements A,B {

	public void show()
	{
		System.out.println("it is interface A method");
	}
	public void display()
	{
		System.out.println("it is interface b method");
	}
	public static void main(String[] args) {
		
		Multiple m=new Multiple();
		m.display();
		m.show();
		
	}
}

//interface -- camera,musicplayer 
//phone --child class 