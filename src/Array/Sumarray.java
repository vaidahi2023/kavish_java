package Array;

import java.util.Scanner;

public class Sumarray {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("elements of array:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("sum="+sum);
	}
}
