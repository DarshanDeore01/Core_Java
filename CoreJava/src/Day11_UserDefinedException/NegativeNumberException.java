package Day11_UserDefinedException;

public class NegativeNumberException extends Exception
{
	String msg;
	  public NegativeNumberException() 
	  {
		super();
		msg="Default:NegativeNumberException.....";
	  }
	  public NegativeNumberException(String msg) 
	  {
		super();
		this.msg = msg;
	  }
	  @Override
	  public String toString() 
	  {
		return "NegativeNumberException [msg=" + msg + "]";
	  }
	  @Override
	  public String getMessage()
	  {
		  return "-ve number exception";
	  }
		 
}
