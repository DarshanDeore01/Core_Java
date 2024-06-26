package Lab_Manual.Lab_Exercise_22;

public class Account 
{
	    String accName;
	    int accNumber;
	    double balance;
	    static final double MINIMUM_BALANCE = 1000.0;
	    
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

	    public void withdraw(double amount) throws LessBalanceException
	    {
	        if (amount > 0) 
	        {
	            double newBalance = balance - amount;
	            if (newBalance < MINIMUM_BALANCE) 
	            {
	                throw new LessBalanceException("Insufficient balance. Minimum balance of " + MINIMUM_BALANCE +
	                		                        " must be maintained.");
	            }
	            balance = newBalance;
	            System.out.println("Withdrew " + amount + ". New balance: " + balance);
	        } 
	        else 
	        {
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
	        Account account = new Account("Darshan",101,1000);

	        account.deposit(2000); 
	        try
	        {
	            account.withdraw(500); 
	        }
            catch (LessBalanceException e)
	        {
	            System.err.println("Error: " + e.getMessage());
	        }

	        System.out.println("Final balance: " + account.getBalance());

	        try 
	        {
	            account.withdraw(11000); 
	        } 
	        catch (LessBalanceException e) 
	        {
	            System.err.println("Error: " + e.getMessage());
	        }
	    }
		
	}


