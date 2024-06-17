package Day6_HW;

/*** Home work Work ***/

public class Computer extends ElectronicDevice {
	
	private String c_name;
	private float c_price;
	
	public Computer()
	{
		c_name="Lenovo";
		c_price=20000;
		
	}
	public Computer(String b,String n, float p)
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
