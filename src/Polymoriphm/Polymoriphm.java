package Polymoriphm;
/*
 * polymoriphm 
 * poly -- many 
 * moriphm --- types /form 
 * 1.complie time polymoriphm 
 * 		---method overloading 
 * 		-- it contain same name but different argument/parmeter
 * 		--it have same class
 * 2.run time polymoriphm 
 * 		--method overriding
 * 		--it inherits parent class method with same name
 * 		--it present in different class
 */
public class Polymoriphm {

	void sum(int a,int b)
	{
		int sum;
		sum=a+b;
		System.out.println("sum="+sum);
	}
	void sum(int a,int b,int c)
	{
		int sum;
		sum=a+b+c;
		System.out.println("sum="+sum);
	}
	public static void main(String[] args) {
		
		Polymoriphm p=new Polymoriphm();
		p.sum(1, 10);
		p.sum(12,13,15);
		
	}
}
