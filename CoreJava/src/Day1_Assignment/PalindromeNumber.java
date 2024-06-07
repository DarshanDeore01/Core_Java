package Day1_Assignment;


// Write a Java Program to check whether given number is palindrome or not.
// Example: 1221 -> 1221 -> palindrome
 
public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 1221; // Given number
        int originalNum = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (originalNum == reversed) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
