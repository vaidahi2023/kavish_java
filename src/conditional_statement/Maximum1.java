package conditional_statement;

import java.util.Scanner;

public class Maximum1 {

	public static void main(String[] args) {
		
		int a,b,c;
		System.out.println("Enter three numbers:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is maximum");
			}
			else 
			{
				System.out.println("c is maximum");
			}
		}
		else 
		{
			if(b>c)
			{
				System.out.println("b is maximum");
			}
			else 
			{
				System.out.println("c is maximum");
			}
		}
		
		
	}
}


//positive --even /odd
//negative

//-5 
//negative 
//odd 
//4
//positive
//even

