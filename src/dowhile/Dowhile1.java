package dowhile;

import java.util.Scanner;

//fibonacci series 
//* 0 1 1 2 3 5 8 13 21 
public class Dowhile1 {

	
	public static void main(String[] args) {
		
		int a=0,b=1,c,n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		System.out.println(a);
		System.out.println(b);
		i=2;
		do
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}while(i<n);
	}
}
