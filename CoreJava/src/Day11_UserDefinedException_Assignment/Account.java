package Day11_UserDefinedException_Assignment;

import java.util.Scanner;


class InsufficientBalanceException extends Exception 
{
 public InsufficientBalanceException(String message) 
 {
     super(message);
 }
}

class Account 
{
 private int accountNo;
 private String name;
 private double balance;

 
 public Account()
 {
     this.accountNo = 0;
     this.name = "";
     this.balance = 0.0;
 }

 
 public Account(int accountNo, String name, double balance) 
 {
     this.accountNo = accountNo;
     this.name = name;
     this.balance = balance;
 }

 public void deposit(double amount) 
 {
     if (amount > 0) 
     {
         balance += amount;
     }
 }

 public void withdraw(double amount) throws InsufficientBalanceException 
 {
     if (amount > balance) 
     {
         throw new InsufficientBalanceException("Insufficient balance to withdraw");
     }
     else
     {
         balance -= amount;
     }
 }

 public void display() 
 {
     System.out.println("Account No: " + accountNo);
     System.out.println("Name: " + name);
     System.out.println("Balance: " + balance);
 }

 
 public static void main(String[] args) 
 {
     Scanner scanner = new Scanner(System.in);

     Account account = new Account(3090320, "Darshan Deore", 50000);

     try
     {
         account.display();
         System.out.print("Enter amount to deposit: ");
         double depositAmount = scanner.nextDouble();
         account.deposit(depositAmount);
         account.display();

         System.out.print("Enter amount to withdraw: ");
         double withdrawAmount = scanner.nextDouble();
         account.withdraw(withdrawAmount);
         account.display();

        assert account.balance >= 1000 : "Balance is below minimum balance of 1000";
     }
     catch (InsufficientBalanceException e) 
     {
         System.out.println("Exception: " + e.getMessage());
     } 
finally 
     {
         scanner.close();
     }
 }
}
