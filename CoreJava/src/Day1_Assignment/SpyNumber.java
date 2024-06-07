package Day1_Assignment;


// Write a Java Program to accept a 2-digit number and check whether it is spy number or not.
// Example: 1124 -> 1 + 1 + 2 + 4 = 8, 1 * 1 * 2 * 4 = 8 -> spy number
 
public class SpyNumber {
    public static void main(String[] args) {
        int num = 1124; // Given number
        int sum = 0;
        int product = 1;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        if (sum == product) {
            System.out.println(num + " is a spy number.");
        } else {
            System.out.println(num + " is not a spy number.");
        }
    }
}
