package Array;

import java.util.Scanner;

/*
 * 4 2 13 14 5
 * 2 4 13 14 5
 * 2 4 13 14 5
 * 2 4 13 5  14
 * 2 4 5 13 14
 * 
 * 
 */
public class Sorting {

	
	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
		System.out.println("elements of a");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
