package Day8_CW_Interface;

public class Rectangle extends MyShape implements Printable  
{
  float l;
  float b;
  public Rectangle() 
   {
	super();
   }
   public Rectangle(float l, float b) 
   {
	super();
	this.l = l;
	this.b = b;
   }
   @Override
   public float area() 
   {
	 return l*b; 
   }
   @Override
   public void print() 
   {
	System.out.println("length:"+l);
	System.out.println("breadth:"+b);
	System.out.println("Area of Rectangle:"+area());
   }
}