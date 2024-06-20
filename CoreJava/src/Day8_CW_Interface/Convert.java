package Day8_CW_Interface;

public class Convert implements  Conversion
{
  public Convert() 
  {
	
  }
  @Override
  public void gmtokg(float gm) 
  {
     float kg=gm/1000.0f;	
	 System.out.println(gm+" gm ="+kg+" kg.");
  }

  @Override
  public void kgtogm(float kg) 
  {
	float gm=kg*1000.0f;  
	System.out.println(kg+" kg ="+gm+" gm.");
 }
  
}
