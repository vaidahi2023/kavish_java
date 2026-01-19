package Array;

import java.util.Scanner;

public class Deletearray {

public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,pos;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		size=s.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the position you want to delete:");
		pos=s.nextInt();
		for(i=pos-1;i<size;i++)
		{
			a[i]=a[i+1];
		}
		size--;
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
		
}
}
