package Inheritance;

public class Tester extends Employee
{
String name="Quality Analyst";
	
	public void tester()
	{
		System.out.println("The designation of employee is: "+name);
	}
	public static void main(String[] args) 
	{
	Tester obj=new Tester();
	obj.empy();
	obj.tester();
	Developer obj2=new Developer();
	obj2.dev();
	obj2.empy();

	}

}
