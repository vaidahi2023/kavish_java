package loops;

import java.util.Scanner;
//6 ==1,2,3 --6
public class Perfect {

	public static void main(String[] args) {
		
		int num,i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		num=s.nextInt();
		
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("it is perfect number");
		}
		else
		{
			System.out.println("it is not a perfect number");
		}
		
	}
}
