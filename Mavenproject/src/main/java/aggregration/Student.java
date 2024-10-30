package aggregration;

public class Student 
{
	String stname;
	int age;
	int marks;
	Address adr;
	
	public Student(String stname,int age,int marks,Address adr)
	{
		this.stname=stname;
		this.age=age;
		this.marks=marks;
		this.adr=adr;
	
	}
	public void display()
	{
		System.out.println("Student name is:" +stname);
		System.out.println("Student age is:" +age);
		System.out.println("Student marks is:" +marks);
		System.out.println("Home  name is:" +adr.name);
		System.out.println("Home num is:" +adr.num);
		System.out.println("pincode  is:" +adr.pin);
		
	}

	public static void main(String[] args) 
	{
		Address obj=new Address("adress",45,"tvm",695003);
		Student obj2=new Student("test",49,100,obj);
		obj2.display();
		

	}

}
