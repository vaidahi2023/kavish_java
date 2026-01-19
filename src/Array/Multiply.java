package Array;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		
		int a[][]=new int [3][3];
		int  b[][]=new int [3][3];
		int res[][]=new int [3][3];
		int i,j,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Enter the elements:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Enter the elements:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum=0;
				for(int k=0;k<3;k++)
				{
					sum=sum+a[i][k]*b[j][k];
				}
				res[i][j]=sum;
			}
		}
		System.out.println("elements of a");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("elements of a");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("result");
		for(i=0;i<3;i++)	
		{
			for(j=0;j<3;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
