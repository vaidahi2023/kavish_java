package class_object;

public class Student {

	int id,age;
	String name;
	
	void display()
	{
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.id=1;
		s1.name="riya";
		s1.age=20;
//		System.out.println("id="+s1.id);
//		System.out.println("name="+s1.name);
//		System.out.println("age="+s1.age);	
		s1.display();
	}
	
	
}

//employee 
//id 
//name
//salary
//position

//yearlysalary()
