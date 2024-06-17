package Day6_HW;

/*** Home work Work ***/
import java.util.Scanner;

public class BookMain 
{
	
	public static void display(Item e)
	{
		
		if(e instanceof Book)
		{
			e.display();
			System.out.println();
			System.out.println(e.toString());
		}
		if(e instanceof MusicCD)
		{
			e.display();
			System.out.println();
			System.out.println(e.toString());
		}
		if( e instanceof Software)
		{
			e.display();
			System.out.println();
			System.out.println(e.toString());
		}
	}
	

	public static void main(String[] args) 
	{
		int choice=0;
		Item e = null;
		
		do 
		{
			System.out.println("1) Book Details"
					+ "\n2) Music Cd Details"
					+ "\n3) Software Deaatils");
			
			System.out.println("Enter your choice: ");
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				e= new Book("Devil","Darshan",2012,12245,1500.0f,"Dilip",1,15);
				display(e);
				break;
				
			case 2:
				e = new MusicCD("David ","Deepak",2012,12245,1500.0f,"Yash",15);
				display(e);
				
			case 3:
				e = new Software("David ","Divyam",2012,12245,1500.0f,15);
				display(e);

				default:
					System.out.println("Invalid Choice");
			}
			
		}while(choice >0);
		
	}
}
//public class BookMain
//{
//	Item ob;
//	= new Book();

//	public static void main(String args[])
//	{
//		Book b1 = new Book();
//		System.out.println(b1);
//		
//		Book b2 = new Book("","",2019,987456321,9600,"",5,30);
//		System.out.println(b2);
//		
//		Music m1 = new Music();
//		System.out.println(m1);
//		
//		Music m2 = new Music("","",2019,987456321,9600," ",30);
//		System.out.println(m2);
//		
//		Software s1 = new Software();
//		System.out.println(s1);
//		
//		Software s2 = new Software("","",2019,987456321,9600,20);
//		System.out.println(s2);
//	}
//	


