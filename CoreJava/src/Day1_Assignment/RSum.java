package Day1_Assignment;

public class RSum {
    public static void main(String[] args) {
        int num = 3496;
        do {
            num = sumOfDigits(num);
        } while (num >= 10);
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
