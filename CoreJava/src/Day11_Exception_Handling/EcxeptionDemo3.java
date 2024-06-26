package Day11_Exception_Handling;
import java.util.*;
public class EcxeptionDemo3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Start Main");
		try
		{
			int n1=10;
		    int n2=5;
		    int ans=n1/n2;//Exception  obj
		    int num[]= new int[2];
		    num[1]=20;//Exception obj
		    //Integer ref=null;
		    //int a=ref.intValue();//Exception obj
		    System.out.println("Enter the num:");
		    int n=sc.nextInt();
		}
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
			// System.out.println(e);
			  // System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
           e.printStackTrace();
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("end main");
	}

}
