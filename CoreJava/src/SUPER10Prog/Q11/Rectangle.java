package SUPER10Prog.Q11;

public class Rectangle
{
    int length;
    int width;
    
    public Rectangle()
    {
    	length=0;
    	width=0;
    }

	public Rectangle(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}

	public int CalArea()
	{
		int area=0;
		area = length * width ;
	    return area;
	}
	
	public void display()
	{
		System.out.println("Area Of Rectangle is: " +CalArea()+"sqcm");
		
	}

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(18,23);
		r.display();

	}

}
