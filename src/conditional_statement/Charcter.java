package conditional_statement;

import java.util.Scanner;

public class Charcter {

	public static void main(String[] args) {
		
		String ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the chracter:");
		ch=s.next();
		if(ch.charAt(0)>='a' && ch.charAt(0)<='z' || ch.charAt(0)>='A' && ch.charAt(0)<='Z')
		{
			System.out.println("it is alphabet");
		}
		else 
		{
			System.out.println("it is not a alphabet");
		}
		
		
	}
}
