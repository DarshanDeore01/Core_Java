package Day1_Assignment;


// Write a Java Program to accept a 2-digit number and check whether it is special or not.
// Example: 49 -> 4 + 9 = 13, 4 * 9 = 36, 13 + 36 = 49 -> special number
 
public class SpecialNumber {
    public static void main(String[] args) {
        int num = 49; // Given number
        int firstDigit = num / 10;
        int secondDigit = num % 10;
        int sum = firstDigit + secondDigit;
        int product = firstDigit * secondDigit;
        if (sum + product == num) {
            System.out.println(num + " is a special number.");
        } else {
            System.out.println(num + " is not a special number.");
        }
    }
}
