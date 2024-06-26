package Day12_Generic_Class.G3;


//Multi-type Parameter

public class GenTwo <T,V>
{
     private T ob1;
     private V ob2;
     
     public GenTwo(T ob1, V ob2)
     {
    	super();
 		this.ob1 = ob1;
 		this.ob2 = ob2;
     }
	
	public T getOb1() 
	{
		return ob1;
	}

	public V getOb2() 
	{
		return ob2;
	}

	public static void main(String[] args) 
	{
		GenTwo<Integer, String> isob = new GenTwo<Integer, String> (1000,"Darshan");
		int a = isob.getOb1();
		System.out.println(a);
		
		String msg = isob.getOb2();
		System.out.println(msg);
		
		
		// Java 7 feature - Diamond operator
		
		GenTwo<Float,Long> flob = new GenTwo<>(55.32f,250000L);
		
		float f = flob.getOb1();
		System.out.println(f);
		
		long l = flob.getOb2();
		System.out.println(l);
	}

}
