package Day10_Covariant_Data_Type;

class Parent
{
	public Number getNum()
	{
	  return 10; 
	}
}
class SubClass extends Parent 
{
	@Override
	public Float getNum()
	{
	  return 20.0f; 
	}	
}



public class MainTest 
{
 public static void main(String[] args) 
 {


 }
}
