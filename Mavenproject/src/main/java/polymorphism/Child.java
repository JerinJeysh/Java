package polymorphism;

public class Child extends Parent
{
	public void add(int c,int d)
	{
		int sum=c+d;
		System.out.println("Child class After addition is:"+sum);
		super.add(10, 20);
	}
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.add(5,10);
		// TODO Auto-generated method stub
		Parent obj1=new Child(); //upcasting creating obj for two different classes
		obj1.add(10, 39);

	}

}
