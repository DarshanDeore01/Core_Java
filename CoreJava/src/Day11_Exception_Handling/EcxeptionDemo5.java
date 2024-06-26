package Day11_Exception_Handling;

public class EcxeptionDemo5 
{

	public static void main(String[] args) 
	{
		{
			  try
			  {
				int ans= 10/0;
				int num[]= new int[2];
				num[2]=10;
			  } // jdk1.7 onwards
			  catch (ArithmeticException | ArrayIndexOutOfBoundsException e) 
			  {
				e.printStackTrace();
			  }
	  }
	}
}


