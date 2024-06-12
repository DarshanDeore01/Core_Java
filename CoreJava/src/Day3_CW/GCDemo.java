package Day3_CW;

//Object- protected void finalize()
class Demo1
{
@Override	
protected void finalize()
{
	 System.out.println("finalize method is called .. f1.close()");  
}
}

public class GCDemo
{
public static void main(String[] args) 
{
	 System.out.println("main method is called... ");
	 //block...1
	 {
	   Demo d1= new Demo();
	   d1=null;
	 }
  System.gc();		
	System.out.println("main method is end... ");
}
}
