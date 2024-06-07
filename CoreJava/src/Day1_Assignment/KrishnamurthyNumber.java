package Day1_Assignment;

public class KrishnamurthyNumber {
    public static void main(String[] args) {
        int num = 145; // Given number
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a Krishnamurthy number.");
        } else {
            System.out.println(num + " is not a Krishnamurthy number.");
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
