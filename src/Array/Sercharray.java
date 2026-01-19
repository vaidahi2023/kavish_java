package Array;

import java.util.Scanner;

public class Sercharray {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int size,i,ele;
		boolean found=false;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array:");
		size=s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the elemnts you want to search");
		ele=s.nextInt();
		for(i=0;i<size;i++)
		{	
				if(ele==a[i])
				{
					found=true;
					break;
				}
		}
		if(found)
		{
			System.out.println("element is present");
		}
		else 
		{
			System.out.println("element is not  present");
		}
		
	}
}
