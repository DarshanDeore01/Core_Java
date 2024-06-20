package Day9_Inner_Classes;
class OutClass
{
	int n; // instance field
	static int count; //static field
	
	public OutClass()
	{
		n=30;
	}
	
	public void m1() // Instance Method
	{
		System.out.println("m1 Mtehod is called...");
	}
	public static void m2() // Static Method
	{
		System.out.println("m2 Mtehod is called...");
	}
	
	static class InClass // Static Inner class
	{
		int m;
		static int cnt;
		
		public InClass()
		{
			m=40;
		}
		public void m3()
		{
			//System.out.println("value of n:"+n);
			System.out.println("value of count:"+count);
		}
	}//end  static class InClass
	
}// end OutClass
public class StaticInnerClass 
{

	public static void main(String[] args) 
	{
	  OutClass out=new OutClass();
	  out.m1();// call instance method
	  OutClass.m2();//call ststic Method
	  
	  OutClass.InClass in = new OutClass.InClass();
	  in.m3();// call instance method 
	}

}
/*
 1] Instance members [field/methods] of outer class not use in 
    static inner class.
 2] Static members [field/methods] of outer class can be use in 
    static inner class.
 3] we can declare/define static and instance members[Fields/Methods]
    in static inner class.    
 4] we can declare static Inner class object without help of 
    Outer class object.
    Syntax 1:
    --------
    InnerClassName ref = new InnerClassConstructor();
    
    Syntax 2:
    --------
    OuterClassName.InnerClassName ref =
       new OuterClassName.InnerClassConstructor();
 */

/* Note:-
-----
 1] Instance members [field/methods] of outer class not use in 
    static inner class.
 2] Static members [field/methods] of outer class can be use in 
    static inner class.
 3] we can declare/define static and instance members[Fields/Methods]
    in static inner class.    
 4] we can declare static Inner class object without help of 
    Outer class object.
    Syntax 1:
    --------
    InnerClassName ref = new InnerClassConstructor();
    
    Syntax 2:
    --------
    OuterClassName.InnerClassName ref =
       new OuterClassName.InnerClassConstructor();
*/