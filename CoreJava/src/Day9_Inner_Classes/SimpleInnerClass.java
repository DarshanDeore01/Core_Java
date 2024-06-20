package Day9_Inner_Classes;

class Outer
{
	int n; // instance Field
	static int count; // Static Field
	
	public Outer()
	{
		n=10;
	}
	public void M1() // instance Method
	{
		System.out.println("m1 Mtehod is called...");
	}
	public static void M2() // static Method
	{
		System.out.println("m2 Mtehod is called...");
	}
	
	class Inner
	{
		int m;
		
		public Inner()
		{
			m=20;
		//static int cnt; error
		}
		public void M3()
		{
		   	   System.out.println("value of n:"+n);
			   System.out.println("value of count:"+count);
			   System.out.println("m3 Mtehod is called...");
	    }
	
	}//end inner class
}//end outer class


public class SimpleInnerClass
{

	public static void main(String[] args)
	{
	   Outer Outobj = new Outer();
	    System.out.println("Value of n:"+Outobj.n); //called instance Field
	    Outobj.M1(); //called instance method
	    Outer.M2(); //called static method
	    
	    Outer.Inner Inobj=Outobj.new Inner();
	    System.out.println("Value of m:"+Inobj.m);
	    Inobj.M3();//called instance method
	}

}
/*
1.Declaring static member in simple inner class is not allowed.
2.Instance members and Static members of outer class can be used
  within Inner class.
3.Simple Inner class Instance is associated with Outer class Instance.   
4.Inner class object create with the help of outer class object.
  Syntax:
  OuterClasName.InnerClassName InnerClassRef=OuterClassRef. new InnerClassConstructor();
  Example:
  Outer.Inner inobj=outobj. new Inner();
*/

/*
1] static members[Fields/Methods] are not allowed to declare in 
  simple inner class.
2] static members[Fields/Methods] of outer class are allowed to use in
  simple inner class.
3] we can declare instance member [Fields/Methods] in inner class.       
4] Inner class associated with outer class Instance.
  i.e. Inner class Object is created with the help of
  outer class object.
  Syntax:-
  OuterClassName.InnerclassName ref_name=
               OuterClassObject.new InnerClassConstructor();
 
     Outer outob= new Outer();
     Syntax:-
     OuterClassName.InnerClassName in_ref=OuterRef.new InnerClassConstructor();  
     Example:-
     Outer.Inner inobj=outob.new Inner();

*/


