package operators;

import java.util.Scanner;

//scanner class is used to scan the value from user
public class ScannerDemo {

	public static void main(String[] args) {
		
		byte b;
		int a;
		float f;
		double d;
		String s1,s2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		a=s.nextInt();
		System.out.println("enter the number");
		f=s.nextFloat();
		System.out.println("Enter tghe number");
		d=s.nextDouble();
		System.out.println("enter the number");
		b=s.nextByte();
		System.out.println("Enter the string");
		s1=s.next();
		s.nextLine();
		System.out.println("Enter the string");
		s2=s.nextLine();
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("f="+f);
		System.out.println("d="+d);
		System.out.println("s1="+s1);
		System.out.println("s2"+s2);
	}
}
