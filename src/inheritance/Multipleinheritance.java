package inheritance;
interface A1
{
	default void show()
	{
		System.out.println("it is interface A");
	}
}
interface B1
{
	default void show()
	{
		System.out.println("it is interface B");
	}
}
public class Multipleinheritance implements A1,B1{

	public void show()
	{
		A1.super.show();
	}
	
	public static void main(String[] args) {
		
		Multipleinheritance m=new Multipleinheritance();
		m.show();
	}
}
