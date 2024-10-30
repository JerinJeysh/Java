package Inheritance;

public class Puppy extends Dog //puppy extends dog and dog extends animal(multilevel inheritance)
{
	int age=1;
	
	public void pup()
	{
		System.out.println("The age of the puppy is: "+age);
	}

	public static void main(String[] args)
	{
	
      Puppy obj=new Puppy();
      obj.anim(); //calling super class
      obj.doggy(); //calling sub class
      obj.pup(); //calling child class
      
	}

}
