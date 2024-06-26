package Lab_Manual.Lab_Exercise_23;

public class Account 
{
    private String accName;
    private int accNumber;
    private double balance;
    private static final double MINIMUM_BALANCE = 1000.0;

    public Account()
    {
        super();
    }
    public Account(String accName, int accNumber, double balance) 
    {
        this.accName = accName;
        this.accNumber = accNumber;
        this.balance = balance; 

    }
    public void deposit(double amount) 
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        }
        else 
        {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) 
    {
        if (amount > 0) 
        {
            double newBalance = balance - amount;
            assert newBalance >= MINIMUM_BALANCE : "Insufficient balance. Minimum balance of " + MINIMUM_BALANCE + " must be maintained.";
            if (newBalance >= MINIMUM_BALANCE) 
            {
                balance = newBalance;
                System.out.println("Withdrew " + amount + ". New balance: " + balance);
            } 
            else 
            {
                System.out.println("Withdrawal would result in balance below the minimum required balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public double getBalance()
    {
        return balance;
    }
    public String getAccName() 
    {
        return accName;
    }
    public int getAccNumber()
    {
        return accNumber;
    }

    public static void main(String[] args) 
    {
        Account account = new Account("Darshan", 101, 10000);
        account.deposit(2000); 
        account.withdraw(500);
        System.out.println("Final balance: " + account.getBalance());
        try 
        {
            account.withdraw(11000); 
        } catch (AssertionError e)
        {
            System.err.println("AssertionError: " + e.getMessage());
        }
    }
}
