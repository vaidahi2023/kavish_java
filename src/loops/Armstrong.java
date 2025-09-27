package loops;

import java.util.Scanner;

/*
 * 153 
 * 1+125+27=153
 */
public class Armstrong {

	
	public static void main(String[] args) {
		
		
		int cube=0,sum=0,num,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		num=s.nextInt();
		temp=num;
		for(;num>0;)
		{
			cube=num%10;
			sum=(int)(sum+Math.pow(cube, 3));
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("It is an armstrong number");
		}
		else 
		{
			System.out.println("it is not an armstrong number");
		}
	}
}
