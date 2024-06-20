package Day9_Inner_Classes.Anonymous_Inner_class;

class OutTest 
{
int n;
    
	Employee e= new Employee()
	{ // start
	    int incentive=1000;
	    @Override
		public void display() 
		{
		  super.display();
		  System.out.println("Employee Incentive:"+incentive);
		}
	};//end class
	
		
	I ob1= new I() 
	{//start
		@Override
		public void display() 
		{
	      System.out.println("display method called");  
	 	}
	};//end 
	
}
public class AnonymousInnerClass 
{

	public static void main(String[] args)
	{
		OutTest ob= new OutTest();
		   ob.e.display();
		   
		   ob.ob1.display();
	}

}
