package Day1_Assignment;


// Write a Java Program to display factorial of a number
// Example: 5! = 5*4*3*2*1 = 120

public class Factorial {
    public static void main(String[] args) {
        int num = 5; // Given number
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}