package Day6_CW_Super.SuperDemo2;

public class Test2 extends Test1 {
	int n;
    public Test2()
    {
      n=10;	
    }
    int max()
    {
    	if(super.n>n)
    		return super.n;
    	else
    		return n;
    }
    public void displayTest2()
    {
    	 super.displayTest1(); 
    	 //using super we can call super class method
    	 System.out.println("n:"+n);
    	 System.out.println("maximum:"+max()); // nesting of method
    }
    }
    
