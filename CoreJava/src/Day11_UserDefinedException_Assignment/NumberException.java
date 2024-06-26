package Day11_UserDefinedException_Assignment;
import java.util.*;
import java.util.Scanner;


class SmallNumberException extends Exception 
{
	String msg;
	
 public SmallNumberException(String msg) 
 {
     super(msg);
     this.msg = msg;
 }

 public static void check(int number) throws SmallNumberException 
 {
     if (number >= 0 && number <= 10) 
     {
         throw new SmallNumberException("Number is between 0 and 10");
     }
 }
}

class ProperNumberException extends Exception 
{
	String msg;
 public ProperNumberException(String msg) 
 {
	 super(msg);
     this.msg = msg;
 }

 public static void check(int number) throws ProperNumberException 
 {
     if (number >= 11 && number <= 15) 
     {
         throw new ProperNumberException("Number is between 11 and 15");
     }
 }
}

class GreaterNumberException extends Exception 
{
	String msg;
 public GreaterNumberException(String msg) 
 {
	 super(msg);
     this.msg = msg;
 }

 public static void check(int number) throws GreaterNumberException
 {
     if (number >= 16 && number <= 20) 
     {
         throw new GreaterNumberException("Number is between 16 and 20");
     }
 }
}

public class NumberException 
{

 public static void main(String[] args) 
 {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int number = scanner.nextInt();

     try 
     {
         SmallNumberException.check(number);
         ProperNumberException.check(number);
         GreaterNumberException.check(number);

         System.out.println("Number is outside the range 0-20");
     } 
     catch (SmallNumberException | ProperNumberException | GreaterNumberException e) 
     {
         System.out.println("Exception: " + e.getMessage());
     } 
     finally
     {
         scanner.close();
     }
 }
}

