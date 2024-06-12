package Day5_HW;

public class Arithmetic {
	public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
}
}

 
