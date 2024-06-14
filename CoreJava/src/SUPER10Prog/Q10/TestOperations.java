package SUPER10Prog.Q10;

public class TestOperations 
{
	public static void main(String[] args) {
        
        Operations op = new Operations();

        
        int sum1 = op.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum1);

        
        int sum2 = op.add(1, 2, 3);
        System.out.println("Sum of 1, 2, and 3: " + sum2);

        
        float sum3 = op.add(1.5f, 2.5f);
        System.out.println("Sum of 1.5 and 2.5: " + sum3);
    }
}
