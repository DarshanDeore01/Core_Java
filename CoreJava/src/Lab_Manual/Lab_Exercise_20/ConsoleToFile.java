package Lab_Manual.Lab_Exercise_20;

import java.io.*;
import java.io.IOException;
import java.util.*;



public class ConsoleToFile 
{

	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter text to write to 'console.txt' (type 'exit' to finish):");
      StringBuilder ic = new StringBuilder();
      String line;
      
      while(!(line = sc.nextLine()).equalsIgnoreCase("exit"))
      {
    	  ic.append(line).append(System.lineSeparator());
    	  
      }
      try(FileWriter fw = new FileWriter("Console.txt"))
      {
    	  fw.write(ic.toString());
    	  System.out.println("Content written to 'console.txt' successfully.");
      }
      catch (IOException e)
      {
    	  System.err.println("An error occurred while writing to 'console.txt': " + e.getMessage());
	  }
      sc.close();
	}

}
