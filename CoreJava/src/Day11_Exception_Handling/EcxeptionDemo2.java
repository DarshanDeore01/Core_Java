package Day11_Exception_Handling;


public class EcxeptionDemo2
{

	public static void main(String[] args)
	{
		System.out.println("Start Main");
		try
		{
		int n1=10;
		int n2=0;
		int ans =n1/n2;
		
		}
		catch (ArithmeticException e)
		{
			 // System.out.println(e);// it call toString();
			 e.printStackTrace();
			 // System.out.println(""+e.getMessage());	
		}
		System.out.println("End Main");
	}


}
