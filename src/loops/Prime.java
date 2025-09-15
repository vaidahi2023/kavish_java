package loops;

import java.util.Scanner;

// prime number --- two factor 
//2,3,5,7,11
public class Prime {

	
	public static void main(String[] args) {
		
		int i,n,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("it is a prime number");
		}
		else 
		{
			System.out.println("it is not a prime number");
		}
	}
}
