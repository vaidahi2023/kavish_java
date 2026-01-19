package function;

import java.util.Scanner;

/*function is sets of instruction
syntax: 
datatype function_name()
{

	//block of statement
}
types of fucntion
1.without argument without return
2.with argument without return
3.without agrument with return
4.with argument with return

object create:

classname objectname=new classname();
*/

public class Function {

	//without argument without return
	//function define
	void sum()
	{
		int a,b,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  two numbers:");
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		System.out.println("sum="+sum);
	}
	
	//without argument with return
	int sum1()
	{
		
			int a,b,sum=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter  two numbers:");
			a=s.nextInt();
			b=s.nextInt();
			sum=a+b;
			return sum;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Function f=new Function();
		f.sum(); //function calling
		int sum=0;
		sum=f.sum1();
		System.out.println("sum="+sum);
		
	}
}
