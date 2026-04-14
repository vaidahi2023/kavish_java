package inheritance;
//hirechical+muliple
class Person 
{
	String name;
	void show()
	{
		System.out.println("name="+name);
		System.out.println("it is person class method");
	}
}
class Student extends Person
{
	int id;
	void study()
	{
		System.out.println("id="+id);
		System.out.println("it student class method");
	}
}
class Employee extends Person
{
	int id;
	void study()
	{
		System.out.println("id="+id);
		System.out.println("it is employee class method");
	}
}
interface job
{
	void monthysalary();
}
interface parttime
{
	void weeklysalary();
}
class WorkingPerson extends Student implements job,parttime
{
	public void weeklysalary() {
	
		System.out.println("it is weelky salary");
	}

	public void monthysalary() {
		
		System.out.println("it is monthly salary");
	}
	
}
public class Hybridinheritance3 {


	public static void main(String[] args) {
		
		WorkingPerson p=new WorkingPerson();
		p.id=1;
		p.name="riya";
		p.show();
		p.study();
		p.monthysalary();
		
	}
	
}
