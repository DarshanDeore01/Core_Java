package Day8_CW_Interface;

public class Ball implements Bounceable,Moveable 
{
   @Override
	public void move() 
	{
	 System.out.println("Ball is Moveable...!!!");	
		
	}
	@Override
	public void bounce() 
	{
	  System.out.println("Ball is Bounceable...!!!");
	}
}
