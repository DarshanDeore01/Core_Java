package Day9_Inner_Classes;

class OutDemo
{
public void display()
{

	final int n=50; //local Variable
	
	//Method Local Inner Class
	
	class InDemo
	{
		int m;
		
		public InDemo()
		{
			m=20;
		}
		public void m1()
		{
			
			System.out.println("m:"+m);
		    System.out.println("n:"+n); // allowed to use final variable
		 // effective final variable jdk1.8
		}
	}//end class
	InDemo ob= new InDemo();
    ob.m1();

}//end method

}//end OutDemoclass
public class MethodLocalInnerClass {

	public static void main(String[] args) 
	{
		OutDemo obj= new OutDemo();
		 obj.display();
	}

}
/*
 Method local Inner class:-
-----------------------------
- A class defined within a method of the inner class is
  called as 'Method Local Inner' class.
- In order to access method local inner class instantiation must happen within 
  the same method,but after the class definition code.
- Local method Inner classes are not a member of any enclosing classes.
- A local inner class defined inside a method body has access to its 
  parameters.

In JDK 1.7:-
------------
- A method-local inner class cannot use variables
  declared within the method unless those variables
  are marked final.
  
  In JDK 1.8 Onwards:-
-------------------
-A variable whose value is not changed once initialized is called an 
 effectively final variable. 
*/