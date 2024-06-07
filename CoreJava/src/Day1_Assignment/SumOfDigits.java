package Day1_Assignment;


// Write a Java Program to accept a number and print sum of digits.
// Example: 3496 -> 3 + 4 + 9 + 6 = 22
 
public class SumOfDigits {
    public static void main(String[] args) {
        int num = 3496; // Given number
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
