package Day5_HW;

public class Calculator {
	public static void main(String[] args) {
        
        Arithmetic arithmetic = new Arithmetic();

        
        int result1 = arithmetic.add(1, 2, 3, 4, 5);
        int result2 = arithmetic.add(10, 20, 30);
        int result3 = arithmetic.add(7, 14, 21, 28);

        
        System.out.println("Sum of 1, 2, 3, 4, 5: " + result1);
        System.out.println("Sum of 10, 20, 30: " + result2);
        System.out.println("Sum of 7, 14, 21, 28: " + result3);
    }
}
