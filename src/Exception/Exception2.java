package Exception;

public class Exception2 {

	public static void main(String[] args) {
		
		int age=19;
		if(age<18)
		{
			throw new ArithmeticException("you are not eligible");
		}
		else
		{
			System.out.println("you are eligible");
		}
		
		
	}
}
