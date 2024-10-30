package Inheritance;

public class Daughter extends Father 
{
 String daug="Daughter name is Ameya";
 public void daug()
 {
	 System.out.println("Hi this is daughter:"+daug);
 }
	public static void main(String[] args)
	{
		Daughter obj=new Daughter();
		obj.grand();
		obj.father();
		Son obj2=new Son();
		obj2.son();
		obj.daug();

	}

}
