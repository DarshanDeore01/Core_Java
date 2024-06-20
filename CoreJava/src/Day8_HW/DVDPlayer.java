package Day8_HW;

public class DVDPlayer implements RemoteDevice
{

	@Override
	public void SwitchOn()
	{
		System.out.println("DVD is Switch On");		
	}

	@Override
	public void SwitchOffs() 
	{
		System.out.println("DVD is Switch Off");	
	}

}
