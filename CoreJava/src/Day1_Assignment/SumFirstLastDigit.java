package Day1_Assignment;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        int num = 1234; // Given number
        int lastDigit = num % 10;
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of first and last digit: " + sum);
    }
}
