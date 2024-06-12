package Day4_HW;

public class AccountMain {
	public static void main(String[] args) {
        // Call the getInterestRate method using the Account class name
        float rate = Account.getInterestRate();

        // Print the interest rate
        System.out.println("The interest rate is: " + rate + "%");
    }
}
