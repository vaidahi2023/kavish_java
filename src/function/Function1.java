package function;

//types of fucntion
//1.without argument without return
//2.with argument without return
//3.without agrument with return
//4.with argument with return

public class Function1 {

	//with argument without return
//	void sum(int a,int b)
//	{
//		int sum=0;
//		sum=a+b;
//		System.out.println("sum="+sum);
//	}

	//with argument with return
	int sum(int a,int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		
		Function1 f=new Function1();
		int sum;
		sum=f.sum(12, 10);
		System.out.println("sum="+sum);
	}
}
