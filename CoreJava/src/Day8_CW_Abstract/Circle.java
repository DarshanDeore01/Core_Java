package Day8_CW_Abstract;

     public class Circle extends MyShape
     {
       float r;

	public Circle() 
	{
		super();
		r=0;
	}

	public Circle(float r) {
		super();
		this.r = r;
	}

	@Override
	public void area()
	{
		System.out.println("Area Of Circle: "+(PI*r*r));
	}
	
    }
