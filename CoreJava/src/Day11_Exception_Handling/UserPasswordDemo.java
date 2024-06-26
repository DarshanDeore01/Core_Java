package Day11_Exception_Handling;
import java.util.*;
import java.io.*;

public class UserPasswordDemo
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		   int count=0;
		   while(true)
		   {
		   try
		   {
		    System.out.print("Enter the username:");
		    String uname=sc.next(); 
		    System.out.print("Enter the password:");
		    String upwd=sc.next();
		    if(uname.equals("admin") && upwd.equals("admin123"))
		    {
			   System.out.println("Hi!"+uname+",Welcome Login Sucessfully...");
		    }
		    else
		    {
		      ++count;
		      if(count>2)
		      {
			    throw new SecurityException("Testing...");
		      }
		      System.out.println("Wrong username or password...");
		      continue;
		    }
		   }
		   catch (SecurityException e) 
		   {
			 e.printStackTrace();
			 break;
		   }
		   }//end while
		   System.out.println("end main");
	}

}
