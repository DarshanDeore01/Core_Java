package Day8_HW;

public class TestRemote 
{

	public static void main(String[] args) 
	{
	    RemoteDevice rd;
	    
	    rd=new TV();
	    rd.SwitchOn();
	    rd.SwitchOffs();
	    
	    
	    rd=new DVDPlayer();
	    rd.SwitchOn();
	    rd.SwitchOffs();
	
	}

}
