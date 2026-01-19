package Array;

import java.util.Scanner;

/*
 * 1 2 3 4 5 
 * ele=8
 * pos=4 
 * 
 * 1 2 3 8 4 5 
 */
public class Insert {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,ele,pos;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		size=s.nextInt();
		System.out.println("Eneter the elements");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the elemnts you want to insert:");
		ele=s.nextInt();
		System.out.println("Enter the position of elements:");
		pos=s.nextInt();
		for(i=size;i>=pos;i--)
		{
			a[i]=a[i-1];
		}
		
		a[pos-1]=ele;
		size++;
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
