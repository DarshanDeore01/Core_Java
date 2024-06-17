package Day6_HW;

/*** Home work Work ***/

public class LedTv extends Tv {
	
private int size;
	
	public LedTv()
	{
		size = 500;
		
	}public LedTv(String b ,String add ,int s)
	{
		super(b,add);
		this.size = s;
	}
	public String toString()
	{
		return super.toString()+"Size is: "+size;
	}
}
