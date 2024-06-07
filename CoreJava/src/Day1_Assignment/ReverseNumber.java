package Day1_Assignment;

// Write a Java Program to display reverse of a number.
// Example: 123 -> 321
 
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123; // Given number
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
