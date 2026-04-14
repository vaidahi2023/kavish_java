package Polymoriphm;
class Box 
{
	int l,w;
	Box()
	{
		l=0;
		w=0;
		System.out.println("it is default constructor");
	}
	Box(int l)
	{
		this.l=l;
	}
	Box(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	void display()
	{
		System.out.println("length="+l);
		System.out.println("width="+w);
	}
}
public class ConstructorO {

	public static void main(String[] args) {
		
		Box b=new Box();
		Box b1=new Box(1);
		Box b2=new Box(12,45);
		b.display();
		b1.display();
		b2.display();
	}
}
