package Day1_Assignment;


//Write a Java Program to accept a number and print recursive sum of digits.
//Example: 3496 -> 3 + 4 + 9 + 6 = 22 -> 2 + 2 = 4
 
public class RecursiveSumOfDigits {
    public static void main(String[] args) {
        int num = 3496; // Given number
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        System.out.println("Recursive sum of digits: " + num);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
