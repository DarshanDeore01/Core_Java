package Day2_CW;

public class Account {

	int accNo;
	String ownerName;
	double Balance;
	
	public void setAccNo(int account)
	{
		accNo=account;
	}
	public int getAccNo()
	{
		return accNo;
	}
	public void setownerName(String Name)
	{
		ownerName= Name;
	}
	public String getownerName()
	{
		return ownerName;
	}
	public void setBalance( double Bal)
	{
		Balance=Bal;
	}
	public double getBalance()
	{
		return Balance;
	}
	
	public void PrintAcc()
	{
		System.out.println("Account Number: "+accNo+"\nOwner Name: "+ownerName+"\nAccount Balance: "+Balance);
	}
	
}//End class
