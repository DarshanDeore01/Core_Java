package Lab_Manual.Lab_Exercise_17;

public class Account
{
	int accid;
	String accname;
	double accbal;
	
	public Account()
	{
		accid = 101;
		accname = "Darshan";
		accbal = 10000;
	}
	
	class locker
	{
		int locid;
		
		public locker()
		{
			locid = 102;
		}
		
		public void print()
		{
			System.out.println("Account Id: "+accid);
			System.out.println("Account Name: "+accname);
			System.out.println("Account Balance: "+accbal);
			System.out.println("Locker ID: "+locid);
		}
	}
}		

   

