package Day12_Generic_Class.G1;

public class MyObjectMain 
{

	public static void main(String[] args) 
	{
         MyObject m = new MyObject(new Integer(100));
         
         MyObject m1 = new MyObject("HELLO");
         
         String str =  (String)m1.get();
         
         m=m1;
         
         Integer n = (Integer)m.get();
         
         System.out.println(n);
         System.out.println(str);
	}

}
