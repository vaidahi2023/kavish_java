package Array;

import java.util.Scanner;

/*
 * 1 3 34 23 50
 * 50
 * max=0
 * if(a[i]>max) //1>0 3>1 34>3 23>34 50>34 
 * {
 * 		max=a[i]; //1 3 34 50
 * }
 * 
 */
public class Maximum {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,max=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum="+max);
		
		
	}
}
