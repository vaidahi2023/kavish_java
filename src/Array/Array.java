package Array;

import java.util.Scanner;

//array is collection of elements having same datatype
//syntax :
//datatype variable_name[size];
//int a[5];
//
public class Array {

	public static void main(String[] args) {
		
		int i,size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=s.nextInt();
		int a[]=new int[size];
		
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
