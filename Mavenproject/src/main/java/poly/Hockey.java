package poly;

public class Hockey extends Sports
{
	public void play()
	{
		//super.play();
		System.out.println("Hockey class play method");
	}

	public static void main(String[] args) 
	{
		Sports s;
		s=new Sports(); // either line 7 can be used both will work
		s.play();
		s=new Cricket(); //upcasting
		s.play();
		s=new Football();
		s.play();
		s=new Hockey();
		s.play();
		

	}

}
