package Constructor;

public class Student {

	int id,age;
	String name;
	Student()
	{
		this.id=0;
		this.age=0;
		this.name="";
		System.out.println("default constructor");
	}
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	void display()
	{
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.display();
		Student s1=new Student(1,"riya");
		s1.display();
		Student s2=new Student(2,"smit",23);
		s2.display();
		
	}
	
}
