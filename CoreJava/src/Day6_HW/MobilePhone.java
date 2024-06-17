package Day6_HW;

/*** Home work Work ***/

public class MobilePhone extends ElectronicDevice {
	
	private String c_name;
	private float c_price;
	
	public MobilePhone()
	{
		c_name="Redmi";
		c_price=10000;
		
	}
	public MobilePhone(String b,String n, float p)
	{
		super(b);
		this.c_name = n;
		this.c_price= p;
	}
	
	public String toString()
	{
		return super.toString()+" Name is :"+c_name+" price is:"+c_price;
	}

}