package Day7_CW_HW;

/*** Up Casting and Down Casting Method   ***/

class Parent 
{
	public void display()
	{
		System.out.println("Parent method");
	}
}
class child extends Parent
{
	public void display()
	{
		System.out.println("Parent method");
	}
	public void Child()
	{
		System.out.println("Child method");
	}	
}


public class Main 
{
 public static void main(String[] args) 
 {
	 Parent p = new child(); //UP casting
	 p.display();
	 
	 child c = (child)p;
	 c.display();
	 c.Child();
	 
	 
 }

 }