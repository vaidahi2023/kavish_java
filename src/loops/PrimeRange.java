package loops;

import java.util.Scanner;

public class PrimeRange {

	
	public static void main(String[] args) {
		
		
		int start,end,num,i,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start number");
		start=s.nextInt();
		System.out.println("Enter the end number");
		end=s.nextInt();
		
		for(num=start;num<=end;num++)
		{
			count=0;
			for(i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(num);
			}
		}
	}
}
