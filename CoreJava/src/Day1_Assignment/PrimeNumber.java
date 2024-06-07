package Day1_Assignment;


//  Write a Java Program to check whether given number is prime or not.
//  Example: 29 -> prime number
//  Example: 15 -> not a prime number
 
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 29; // Given number
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
