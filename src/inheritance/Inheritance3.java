package inheritance;
class Person 
{
	private String name;
	Person(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	}
}
class Employee extends Person
{
	private int employeeId;
	Employee(int eid,String name)
	{
		super(name);
		this.employeeId=eid;
	}
	int getid()
	{
		return employeeId;
	}
}
class Manager extends Employee
{
	private String department;
	Manager(int eid,String name,String department)
	{
		super(eid,name);
		this.department=department;
	}
	void display()
	{
		System.out.println("id="+getid());
		System.out.println("name="+getname());
		System.out.println("department="+department);
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		
		Manager m=new Manager(1,"het","sales");
		m.display();
	}
}
