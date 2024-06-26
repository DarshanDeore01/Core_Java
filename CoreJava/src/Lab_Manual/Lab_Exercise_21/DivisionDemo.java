package Lab_Manual.Lab_Exercise_21;

import java.util.Scanner;

public class DivisionDemo
{
    
    public static double divide(int numerator, int denominator) throws ArithmeticException 
    {
        if (denominator == 0) 
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            double result = divide(numerator, denominator);
            System.out.println("Result: " + result);
            
        } 
        catch (ArithmeticException e) 
        {
              System.out.print("Error: " + e.getMessage());
              e.printStackTrace();
        } 
        finally
        {
            scanner.close();
        }
    }
}


