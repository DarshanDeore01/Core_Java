package Day1_Assignment;


// Write a Java Program to check whether given number is a perfect number or not.
// Example: 6 -> 1 + 2 + 3 = 6 -> perfect number
// Example: 28 -> 1 + 2 + 4 + 7 + 14 = 28 -> perfect number
 
public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28; // Given number
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
