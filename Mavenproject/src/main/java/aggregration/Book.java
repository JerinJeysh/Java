package aggregration;

public class Book 
{
	String bookname;
	int year;
	Author ar;
	public Book(String bookname,int year,Author ar)
	{
		this.bookname=bookname;
		this.year=year;
		this.ar=ar;
	
	}
	public void display()
	{
		System.out.println("Book name is :" +bookname);
		System.out.println("year  of publication is :" +year);
		System.out.println("Author name is :"+ar.name);
		System.out.println("Book price is :"+ar.num);
		System.out.println("ISBN number is :"+ar.isbn);
		
	}

	public static void main(String[] args)
	{
		Author obj1=new Author("Charles",500,90001);
		Book obj=new Book("Testing",1990,obj1);
		obj.display();
		// TODO Auto-generated method stub

	}

}
