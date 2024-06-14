package Day6_CW_Super.SuperDemo1;

public class Emp {
	public Emp() 
	  {
	    this(10);	
	    System.out.println("Default Constructor...Parent");
	  }	
	  public Emp(int n) 
	  {
		System.out.println("Parameterized Constructor...Parent");
	  }
}
