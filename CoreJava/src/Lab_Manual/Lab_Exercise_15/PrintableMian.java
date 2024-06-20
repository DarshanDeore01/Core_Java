package Lab_Manual.Lab_Exercise_15;

public class PrintableMian
{

	public static void main(String[] args) 
	{
		Printable p;
		
		p=new Employee();
		p.Print();	
		System.out.println("\n----------------------");
		p=new Date();
		p.Print();
		System.out.println("\n----------------------");
		p=new Shape();
		p.Print();

	}

}
