package Array;
//a-- 1,2,3,4,5
//b --6 7 8 9 10
//c -- 1,2,3,4,5,6,7,8,9,10
import java.util.Scanner;

public class CopyArray {

	
	public static void main(String[] args) {
		
		int a[]=new int[10];
		int b[]=new int[10];
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
			b[i]=a[i];
		}
		System.out.println("elements of b");
		for(i=0;i<size;i++)
		{
			System.out.println(b[i]);
		}
	}
}
