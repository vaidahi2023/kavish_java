package Exception;

import java.util.Scanner;

//Exception Types
//Checked Exceptions – Checked at compile time (e.g., IOException, SQLException).
//Unchecked Exceptions – Occur at runtime (e.g., ArithmeticException, NullPointerException).
// try
//{
//}catch()

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a,b,div;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter teh numbers:");
		a=s.nextInt();
		b=s.nextInt();
//		div=a/b;
		try
		{
			div=a/b;
		}catch (ArithmeticException e) {
			System.out.println("divide by 0 is not possible");
			System.out.println(e.getMessage());
		}
		
		
	}
}
