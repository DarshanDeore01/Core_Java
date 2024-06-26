package Day11_UserDefinedException_Assignment;

import java.util.Scanner;


class NegativeNumberException1 extends Exception
{
	String msg;
     public NegativeNumberException1(String msg) 
      {
         super(msg);
         this.msg=msg;
      }
}

public class PositiveCheck
{

 public static void main(String[] args) 
 {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int number = scanner.nextInt();

     try
     {
         if (number < 0) 
         {
             throw new NegativeNumberException1("Number is negative");
         }
         System.out.println("Number is positive.");
     } 
     catch (NegativeNumberException1 e)
     {
         System.out.println("Exception: " + e.getMessage());
     } finally 
     {
         scanner.close();
     }
 }
}

