package Day12_Generic_HW;


public class Account
{
 private String accountNumber;
 private double balance;


 public Account(String accountNumber, double balance) 
 {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public String getAccountNumber() 
 {
     return accountNumber;
 }

 public void setAccountNumber(String accountNumber)
 {
     this.accountNumber = accountNumber;
 }

 public double getBalance()
 {
     return balance;
 }

 public void setBalance(double balance) 
 {
     this.balance = balance;
 }


 public void deposit(double amount) 
 {
     if (amount > 0) 
     {
         balance += amount;
     }
 }

 public boolean withdraw(double amount) 
 {
     if (amount > 0 && balance >= amount)
     {
         balance -= amount;
         return true;
     }
     return false;
 }
}


 class SavingAccount extends Account 
 {
 private double interestRate;

 public SavingAccount(String accountNumber, double balance, double interestRate)
 {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }

 public double getInterestRate()
 {
     return interestRate;
 }

 public void setInterestRate(double interestRate)
 {
     this.interestRate = interestRate;
 }

 public void addInterest()
 {
     double interest = getBalance() * interestRate / 100;
     deposit(interest);
 }
}

 class CurrentAccount extends Account 
 {
 private double overdraftLimit;

 public CurrentAccount(String accountNumber, double balance, double overdraftLimit) 
 {
     super(accountNumber, balance);
     this.overdraftLimit = overdraftLimit;
 }

 public double getOverdraftLimit() 
 {
     return overdraftLimit;
 }

 public void setOverdraftLimit(double overdraftLimit) 
 {
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public boolean withdraw(double amount) 
 {
     if (amount > 0 && getBalance() + overdraftLimit >= amount)
     {
         setBalance(getBalance() - amount);
         return true;
     }
     return false;
 }
}
 class AccountTransaction<T extends Account> 
 {
 private T account;

 public AccountTransaction(T account) 
 {
     this.account = account;
 }

 public void deposit(double amount)
 {
     account.deposit(amount);
 }

 public boolean withdraw(double amount) 
 {
     return account.withdraw(amount);
 }

 public double getBalance()
 {
     return account.getBalance();
 }

 public String getAccountDetails() 
 {
     return "Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance();
 }
}
