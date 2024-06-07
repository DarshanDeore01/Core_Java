package Day2_HW;

public class MobileDevice 
{ 
        int Id;
        String DeviceName;
        int Price;
        int Ram;
        
    public void setId(int Mid)
    {
    	Id=Mid;
    }
    
    public int getId()
    {
    	return Id;
    }
    
    public void setDeviceName(String MName)
    {
    	DeviceName=MName;
    }
    
    public String getDeviceName()
    {
    	return DeviceName;
    }
        
    public void setPrice(int MPr )
    {
    	Price=MPr;
    }
    
    public int get()
    {
    	return Price;
    }
    
    public void setRam( int MRm )
    {
    	Ram=MRm;
    }
    
    public int getRam()
    {
    	return Ram;
    }
        
    public void PrintDevice()
	{
		System.out.println("\nMobile Device Id:"+Id+"\nMobile Device Name:"+DeviceName+"\nMobile Device Price:"+Price+"\nMobile Device Ram:"+Ram);
	}
    
} // End class
