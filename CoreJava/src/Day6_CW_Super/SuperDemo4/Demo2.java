package Day6_CW_Super.SuperDemo4;

public class Demo2 extends Demo1{
	int y;
	   public Demo2() 
	   {
	     super(50);
	     y=20;
	   }
	   Demo2(int y)
	   {
		  this.y=y;
	   }
	   public void displayY()
	   {
		   System.out.println("y:"+y);
	   }
}
