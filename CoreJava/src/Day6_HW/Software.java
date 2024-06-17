package Day6_HW;
public class Software extends Item {
	
	   float version;
		
		public Software()
		{
			version=0.0f;
		}
		public Software(String t, String p, int yp, int in, float pr, float v2)
		{
			super(t,p,yp,in,pr);
			this.version= v2;
		}
		
		@Override
		public void display()
		{
			System.out.println("Title: "+super.toString());
			System.out.println("\n Version is :"+ version);
		}
		public String toString()
		{
			return super.toString()+"Version is : "+version;
		}
		
		

	}
//public class Software extends Item
//{
//	private float version;
//	
//	public Software()
//	{
//		version=(float) 2.93;
//	}
//	public Software(String t, String p, int yp, int in, float pr, float v2)
//	{
//		super(t,p,yp,in,pr);
//		this.version= v2;
//	}
//	public String toString()
//	{
//		return super.toString()+"Version is : "+version;
//	}
//}
