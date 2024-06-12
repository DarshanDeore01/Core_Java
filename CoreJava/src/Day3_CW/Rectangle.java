package Day3_CW;

/** Java Program to calculate area of rectangle with including object  **/


public class Rectangle {
	int length, breadth,area;
	private int l;
	private int b;
	
	public Rectangle()
	{
		length=10;
		breadth= 20;
		calArea();
	}
	public Rectangle(int l, int b)
	{
		this.length= l;
		this.breadth=b;
		calArea();
	}
	public void calArea()
	{
		area =length * breadth;
	}
	
	public Rectangle calArea(Rectangle c)
	{
		Rectangle c1 =new Rectangle();
		c1.length =this.length * c.length;
		c1.breadth = this.breadth * c.breadth;
		c1.area = c1.length * c1.breadth;
		
		return c1;	
		
	}
	public void display()
	{
		System.out.println("The addition is"+area);
	}

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.calArea();
		r1.display();
		Rectangle r2 = new Rectangle(10,20);
		r2.calArea();
		r2.display();
		Rectangle r3 = r1.calArea(r2);
		System.out.println("The area is "+r3.area);
	}
}
