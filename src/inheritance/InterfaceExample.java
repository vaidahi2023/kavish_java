package inheritance;

//interface is like class but it is not a class 
//we can only declare the method in interface and that method will be define by child class 
//to inherit interface -- implements
//interface A 
//{
//	public void fun();
//}
public class InterfaceExample implements A {

	
	public void fun() {
	
		System.out.println("interface method");
	}
	public static void main(String[] args) {
		
		
		InterfaceExample i=new InterfaceExample();
		i.fun();
	}

}
