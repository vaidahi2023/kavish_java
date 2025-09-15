package conditional_statement;

//import java.util.Scanner;

import java.util.*;

public class IF {

	public static void main(String[] args) {
		
		int a;
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=b.nextInt();
		if(a>20)
		{
			System.out.println("number is greater than 20");
		}
		else 
		{
			System.out.println("number is less than 20");
		}
	}
	
}
