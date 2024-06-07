package Day1_Assignment;


// * Write a Java Program to check whether given number is an Armstrong number or not.
// * Example: 153 -> 1^3 + 5^3 + 3^3 = 153 -> Armstrong number
 
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153; // Given number
        int originalNum = num;
        int result = 0;
        while (num != 0) {
            int remainder = num % 10;
            result += remainder * remainder * remainder;
            num /= 10;
        }
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
