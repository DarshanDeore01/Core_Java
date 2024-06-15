package SUPER10Prog.Q1;
import java.util.*;

public class Account 
{
	int ano;
    String cname;
    String city;
    int abal;
    static int cnt;
    
	public Account() 
	{
		super();
		ano=++cnt;
		cname=null;
		city=null;
		abal=0;
	}

	public Account(int ano, String cname, String city, int abal)
	{
		super();
		this.ano = ano;
		this.cname = cname;
		this.city = city;
		this.abal = abal;
	}
	
	public void accept()
	  {
		Scanner sc= new Scanner(System.in);
		System.out.println("Account Id:"+ano);
		System.out.println("Customer Name:");
		cname=sc.next();
		System.out.println("Customer City:");
		city=sc.next();
		System.out.println("Account Balance:"+abal);
	  }
	
	public void display()
	{
		System.out.println("Account Id:"+ano);
		System.out.println("Customer Name:"+cname);
		System.out.println("Customer City:"+city);
		System.out.println("Account Balance:"+abal);
	}
	 public void deposit(int amount) 
	 {
	        abal += amount;
	        System.out.println("Amount deposited.....! Available balance: " + abal);
	 }
	 public void withdraw(int amount) 
	    {
	        if (abal >= amount) 
	        {
	            abal -= amount;
	            System.out.println("Amount withdrawn.....! Available balance: " + abal);
	        } 
	        else 
	        {
	            System.out.println("Insufficient balance."+abal);
	        }
	    }

	 public void transfer(Account receiver, int amount) 
	    {
	        if (abal >= amount) 
	        {
	            abal -= amount;
	            receiver.abal += amount;
	            System.out.println("Amount transferred.....!  Available balance: " + abal);
	        }
	        else
	        {
	            System.out.println("Insufficient balance.");
	        }
	    }
}
