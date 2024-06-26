package Day11_Exception_Handling;

import java.io.FileNotFoundException;

public class MainApp
{
	public static void m3() throws FileNotFoundException
	 {
	   System.out.println("m1.. called..");
	   
	    throw new FileNotFoundException("Car....");

	  }
	  public static void m2() throws FileNotFoundException
	  {
		 m3(); 
		 System.out.println("m2.. called..");
	  }	
	 public static void m1() throws FileNotFoundException
	 {
		 m2();
		 System.out.println("m1.. called..");
	 }
	 public static void main(String[] args) throws FileNotFoundException 
	 {
	   m1();

	 }

}
