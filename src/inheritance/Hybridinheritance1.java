package inheritance;
//hirechical +multilevel
class Bank 
{
	private int accno;
	private String name;
	private int balance;
	Bank(int accno,int balance,String name)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	int getaccno()
	{
		return accno;
	}
	String getname()
	{
		return name;
	}
	int getbalance()
	{
		return balance;
	}
}
class Sbi extends Bank
{
	Sbi(int accno,int balance,String name)
	{
		super(accno,balance,name);
	}
}
class BOB extends Bank
{
	BOB(int accno,int balance,String name)
	{
		super(accno,balance,name);
	}
}
class subBob extends BOB
{

	subBob(int accno, int balance, String name) {
		super(accno, balance, name);
		
	}
	void showdetails()
	{
		System.out.println("Account number="+getaccno());
		System.out.println("name="+getname());
		System.out.println("balance="+getbalance());
	}
	
}	

public class Hybridinheritance1 {

public static void main(String[] args) {
		
		subBob b=new subBob(1,20000,"riya");
		b.showdetails();
		
	}
	
}
