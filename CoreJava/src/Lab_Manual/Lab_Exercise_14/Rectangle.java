package Lab_Manual.Lab_Exercise_14;

public class Rectangle extends Shape
{
       float l;
       float b;
	
	public Rectangle() 
	{
		super();
		l=0;
		b=0;
	}

	public Rectangle(float l, float b)
	{
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public void Area() 
	{
		System.out.println("Area Of Rectangle : "+(l*b)+"SqCm");		
	}

}
