package Day10_Clone;

public class Demo implements Cloneable 
{
  int x;
  int y;
  public Demo() 
  {
	super();
  }
  public Demo(int x, int y) 
  {
	super();
	this.x = x;
	this.y = y;
  }
  @Override
  public String toString() 
  {
	return "x=" + x + ", y=" + y;
  }
/*  @Override
  protected Demo clone() throws CloneNotSupportedException 
  {
	Demo d= new Demo();
	d.x=this.x;
	d.y=this.y;
	return d;
  }*/
  @Override
  protected Object clone() throws CloneNotSupportedException 
  {
	return super.clone();
  }
}//end class
