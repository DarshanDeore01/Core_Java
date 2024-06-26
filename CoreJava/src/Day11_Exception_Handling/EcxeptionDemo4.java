package Day11_Exception_Handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EcxeptionDemo4 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = null;
		int ch=0;
		try
		{
			fis= new FileInputStream("C:\\Users\\DARSHAN\\git\\Core_Java\\CoreJava\\src\\Day11_Exception_Handling\\a.txt");  
			  while(true)
			  {
			    ch= fis.read();
			    if(ch==-1)
			    	break;
			    System.out.print((char)ch);
			  }
		}
		 catch (FileNotFoundException e) 
		   {
			e.printStackTrace();
			System.out.println("file name is incorrect...");
		   }
		   catch (SecurityException e) 
		   {
			e.printStackTrace();
			System.out.println("file Security...");
		   }
		   catch (Exception e) 
		   {
			 e.printStackTrace();
		   }
		   finally 
		   {
			System.out.println("AlwaYS EXECUTED..");
			fis.close();
		   }
	}

}
