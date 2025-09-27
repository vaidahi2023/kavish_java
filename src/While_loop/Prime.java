package While_loop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		
		int i,n,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		i=1;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("it is a prime number");
		}
		else 
		{
			System.out.println("it is not a prime  number");
		}
	}
}
