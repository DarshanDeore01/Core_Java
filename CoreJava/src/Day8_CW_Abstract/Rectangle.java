package Day8_CW_Abstract;

public class Rectangle extends MyShape 
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
	public void area() 
	{
		System.out.println("Area Of Rectangle :"+(l*b));
	}
	
}
