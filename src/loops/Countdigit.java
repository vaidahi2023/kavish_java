package loops;

import java.util.Scanner;

//
public class Countdigit {

	public static void main(String[] args) {
	
		int n,count=0,last,first=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		last=n%10;
		for(;n>10;)
		{
			count++;
			n=n/10;
			first=n;
		}
		System.out.println("no of digit in number is "+count);
		System.out.println("last="+last );
		System.out.println("first digit="+first);
	}
}
