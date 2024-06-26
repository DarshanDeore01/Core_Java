package Lab_Manual.Lab_Exercise_21;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileDemo
{

	public static void main(String[] args) 
	{
           FileReader fr = null;
           
           try 
           {
        	   File f = new File("C:\\Users\\DARSHAN\\git\\Core_Java\\CoreJava\\src\\Lab_Manual\\Lab_Exercise_20\\f.txt");
        	   fr = new FileReader(f);
        	   System.out.println("File 'f.txt' found and opened successfully.");
        	   int firstChar = fr.read();
        	   System.out.println("First character in the file: " + (char) firstChar);
               
           }
           catch (FileNotFoundException e) 
           {
        	   System.err.println("File 'file.txt' not found: " + e.getMessage());
		   }
           catch (IOException e)
           {
        	   System.err.println("An I/O error occurred: " + e.getMessage());
		   }
           finally 
           {
			if(fr !=null)
			{
				try
				{
					fr.close();
					System.out.println("File 'f.txt' closed successfully.");
				}
				catch (IOException e) 
				{
					System.err.println("An error occurred while closing the file: " + e.getMessage());
				}
			}
	    }
	}
}
