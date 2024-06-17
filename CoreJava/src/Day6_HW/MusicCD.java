package Day6_HW;
/***  Sharpen your pencil Class Work ***/

public class MusicCD extends Item{

	String artist;
	 int volume1;
	
	public MusicCD()
	{
		artist = null;
		volume1=0;
	}
	public MusicCD(String t, String p, int yp, int in, float pr, String at,int v1)
	{
		super(t,p,yp,in,pr);
		this.artist=at;
		this.volume1 =v1;
	}
	@Override
	public void display()
	{
		System.out.println("Title: "+super.toString());
		System.out.println("\n Artist is:"+ artist);
		System.out.println("\nVolume is :: "+volume1);
	}
	public String toString()
	{
		return super.toString()+" Artist is: "+artist+"Volume is : "+volume1;
	}
}
//public class Music extends Item
//{
//	private String artist;
//	private int volume1;
//	
//	public Music()
//	{
//		artist = "Yogesh Chavan";
//		volume1=36;
//	}
//	public Music(String t, String p, int yp, int in, float pr, String at,int v1)
//	{
//		super(t,p,yp,in,pr);
//		this.artist=at;
//		this.volume1 =v1;
//	}
//	public String toString()
//	{
//		return super.toString()+" Artist is: "+artist+"Volume is : "+volume1;
//	}
//}
