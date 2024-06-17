package Day6_HW;

/*** Home work Work ***/

public class LcdTv extends Tv {
	
	private String color;
	
	public LcdTv()
	{
		color = "Red";
		
	}public LcdTv(String b ,String add ,String c)
	{
		super(b,add);
		this.color = c;
	}
	public String toString()
	{
		return super.toString()+"Color is: "+color;
	}
	
}