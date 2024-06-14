package Day6_CW_Super.SuperDemo3;

public class Demo2 extends Demo1 {
	int n; // Instance Field 
	   public Demo2() 
	   {
	     n=20;
	   }
	   public void display()
	   {
		 int n=30;
		 System.out.println("Local Varibale Value of n:"+n);
		 System.out.println("Instance Field Value of n:"+this.n);
		 System.out.println("Inhertied/Super Value of n:"+super.n);
	   }
}
