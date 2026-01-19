package Array;

import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		
		int a[][]=new int [2][2];
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("elements of a");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
