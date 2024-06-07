package Day1_Assignment;

public class DuckNumber {
    public static void main(String[] args) {
        int num = 3052; // Given number
        String strNum = String.valueOf(num);
        if (strNum.contains("0")) {
            System.out.println(num + " is a duck number.");
        } else {
            System.out.println(num + " is not a duck number.");
        }
    }
}
