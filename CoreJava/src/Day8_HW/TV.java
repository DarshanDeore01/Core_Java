package Day8_HW;

public class TV implements RemoteDevice
{

	@Override
	public void SwitchOn() 
	{
	    System.out.println("TV is Switch On");	
	}	

	@Override
	public void SwitchOffs() 
	{
		System.out.println("TV is Switch Off");			
	}
      
}
