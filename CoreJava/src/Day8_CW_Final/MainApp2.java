package Day8_CW_Final;

class Demo
{
  int x;
  int y;
  public Demo()
  {
	 x=y=0; 
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
}//end class
public class MainApp2 
{
 public static void main(String[] args) 
 {
   final Demo d1= new Demo(10,20);
   System.out.println("d1:"+d1);
   d1.x=100;
   d1.y=200;
   System.out.println("d1:"+d1);
   
   //d1= new Demo(40,60); // error
  // System.out.println("d1:"+d1);
	 
	 

 }//end main
}//end class