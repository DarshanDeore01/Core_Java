package Day6_HW;

/***  Sharpen your pencil Class Work ***/

public class Item {
	
	String title, publisher;
	int yearPublisher,ISBN ;
	float price;
	
	public Item()
	{
		title= null;
		publisher = null;
		yearPublisher = 0;
		ISBN =0;
		price= 0.0f;
		
	}
	public Item(String title, String publisher, int year, int isbn, float price )
	{
		this.title = title;
		this.publisher = publisher;
		this.yearPublisher = year;
		this.ISBN = isbn;
		this.price  = price;
	}
	public void display()
	{
		System.out.println("Title: "+title);
		System.out.println("\n Publisher "+ publisher);
		System.out.println("\nYear Publisher: "+yearPublisher);
		System.out.println("\nIsbn: "+ISBN);
		System.out.println("\nprice: "+price);
	}
	public String toString()
	{
		return "\ntitle:"+title+"\nPublisher"+publisher+"\nYear Publisher:"+yearPublisher+"\nIsbn: "+ISBN+"\nPrice: "+price;
	}
}


///*** Home work Work ***/
//
//public class Item
//{
//	
//	private String title,publisher;
//	private int yearPublisher, ISBN;
//	private float price;
//	
//	public 	Item()
//	{
//		title ="Book Item";
//		publisher="Deepak Awad";
//		yearPublisher = 2015;
//		ISBN =123456789;
//		price = 2500;
//	}
//	public Item(String t, String p, int yp, int in, float pr)
//	{
//		this.title = t;
//		this.publisher = p;
//		this.yearPublisher = yp;
//		this.ISBN = in;
//		this.price = pr;
//	}
//	
//	public String toString()
//	{
//		return "\nTitle: "+title+"\nPublisher Name: "+publisher+"\nYear Publisher: "+yearPublisher+"\nISBN: "+ISBN+"\nPrice: "+price;
//	}
//}
	
	
	
	
	
	