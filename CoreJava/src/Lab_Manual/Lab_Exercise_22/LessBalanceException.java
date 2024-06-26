package Lab_Manual.Lab_Exercise_22;

public class LessBalanceException extends Exception
{
	String msg;
	
	public LessBalanceException()
	{
		super();
		msg="Default:LessBalanceException.....";
	}

	public LessBalanceException(String msg) 
	{
		this.msg = msg;
	}
	 @Override
	  public String toString() 
	  {
		return "LessBalanceException [msg=" + msg + "]";
		
	  }
	  @Override
	  public String getMessage()
	  {
		  return ": Minimum balance is 1000/-Rs.";
	  }
}
