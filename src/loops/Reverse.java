package loops;

import java.util.Scanner;

/*
 * 123
 * rem=num%10=123%10=3  12%10=2 1%10=1
 * rev=rev*10+rem //  rev=0*10+3=3 rev=3*10+2=32 rev=32*10+1=321
 * num=num/10 =12 12/10=1 1/10 =0
 */
public class Reverse {

	
	public static void main(String[] args) {
		
		int num,rem=0,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		num=s.nextInt();
		
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reverese number:"+rev);
	}
}
