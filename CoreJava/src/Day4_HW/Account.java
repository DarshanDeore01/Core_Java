package Day4_HW;

public class Account {
	// Static data member for interest rate
    static float interestRate;

    // Static initialization block to initialize interest rate
    static {
        interestRate = 3.5f;  // Initialize with a sample interest rate
    }

    // Static method to get the interest rate
    public static float getInterestRate() {
        return interestRate;
    }
}
