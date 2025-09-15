package conditional_statement;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is maximum number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is maximum number");
		}
		else 
		{
			System.out.println(c+" is maximum number");
		}
	}
}
//negative,positive,zero
//
ch>='a' && ch<='z'