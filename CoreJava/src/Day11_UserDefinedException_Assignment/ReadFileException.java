package Day11_UserDefinedException_Assignment;
import java.io.*;


class InvalidCharacterFoundException extends Exception 
{
	String msg;
 public InvalidCharacterFoundException(String msg) 
 {
	 super(msg);
	 this.msg=msg;
	 
 }
}

public class ReadFileException 
{

 public static void main(String[] args) 
 {
     File file = new File("C:\\Users\\DARSHAN\\git\\Core_Java\\CoreJava\\src\\Day11_UserDefinedException_Assignment\\sample.txt");

     try (FileReader fr = new FileReader(file)) 
     {
         int ch;
         while ((ch = fr.read()) != -1) 
         {
             if ((char) ch == 'z')
             {
                 throw new InvalidCharacterFoundException("Character 'z' found in file");
             }
             System.out.print((char) ch);
         }
         } catch (FileNotFoundException e) 
     {
         System.out.println("File not found: " + e.getMessage());
     } 
     catch (IOException e) 
     {
         System.out.println("IOException: " + e.getMessage());
     } catch (InvalidCharacterFoundException e) 
     {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
