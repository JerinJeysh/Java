package Inheritance;

public class Car extends Vehicle  //inheriting parent class vehicle
{
	public void show()
	{
		int year=2024;
		String type="petrol";
		System.out.println("The Year of manufacture is: "+year);
		System.out.println("The type of fuel is: "+type);
	}

	public static void main(String[] args) 
	{
	
      Car obj=new Car(); //creating object for subclass
      obj.display();  //calling parent class by using subclass object
      obj.show();
      System.out.println(obj.name); //from main method
	  System.out.println(obj.num);  //from main method
	}

}
