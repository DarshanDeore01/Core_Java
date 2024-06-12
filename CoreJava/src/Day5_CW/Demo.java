package Day5_CW;

public class Demo {
	int x;
	 public Demo(int x)
	 {
		 this.x=x;
	 }
	@Override
	public String toString() {
		
		return ": X = "+x;
	}
	
	public static void Update (Demo d)
	{
		d.x+=20;
	}

public static void main(String[] args) 
{
	Demo d1 =new Demo(10);
	System.out.println("Before d1"+d1);
	Update(d1);
	System.out.println("After d1"+d1);
}
}
 