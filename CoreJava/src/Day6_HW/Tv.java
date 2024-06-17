package Day6_HW;

/*** Home work Work ***/

public class Tv extends ElectronicDevice {
	
	private String manu_add;
	
	public Tv()
	{
		manu_add = "London";
	}
	public Tv(String b ,String s)
	{
		super(b);
		this.manu_add = s;
	}
	public String toString()
	{
		return super.toString()+"Manufacture address:"+manu_add;
	}

}
