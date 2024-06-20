package Lab_Manual.Lab_Exercise_14;

public class Circle extends Shape
{
      float r;

	
	public Circle()
	{
		super();
		r=0;
	}


	public Circle(float r)
	{
		this.r = r;
	}


	@Override
	public void Area() 
	{
		System.out.println("Area Of Circle : "+(PI*r*r)+"SqCm");		
	}
      
      
}
