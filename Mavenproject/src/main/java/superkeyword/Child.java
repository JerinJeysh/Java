package superkeyword;

public class Child extends Parent
{
	String colour="Yellow";
	public void display()
	{
		super.display();
		System.out.println("The Child class colour is:"+colour);
		
	}
	public Child(int a)
	{
		super(10);
		System.out.println(+a);
	}
	public static void main(String args[])
	{
		Child obj=new Child(7);
		obj.display();
	}

}
