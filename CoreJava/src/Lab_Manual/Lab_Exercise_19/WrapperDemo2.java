package Lab_Manual.Lab_Exercise_19;

public class WrapperDemo2 
{

	public static void main(String[] args) 
	{
		//Primitive Type to Object Type
		   int n=10;
		   Integer iob=n; // auto boxing 
		   System.out.println("value of n:"+n);
		   System.out.println("value of iob:"+iob);
		   
		 // Object Type to Primitive Type 
		   int a=iob; // auto unboxing  
		   System.out.println("value of a:"+a);
	}

}
