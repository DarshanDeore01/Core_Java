package Day1_Assignment;

public class NeonNumber {
    public static void main(String[] args) {
        int num = 9; // Given number
        int square = num * num;
        int sumOfDigits = 0;
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        if (sumOfDigits == num) {
            System.out.println(num + " is a neon number.");
        } else {
            System.out.println(num + " is not a neon number.");
        }
    }
}
