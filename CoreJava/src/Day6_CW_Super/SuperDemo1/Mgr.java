package Day6_CW_Super.SuperDemo1;

public class Mgr extends Emp {
	public Mgr() 
	  {
	   this(10);
	   System.out.println("Default Constructor...Child");
	  }	
	  public Mgr(int n) 
	  {
		super(20);  
	    System.out.println("Parameterized Constructor...Child");
	  }	
}
