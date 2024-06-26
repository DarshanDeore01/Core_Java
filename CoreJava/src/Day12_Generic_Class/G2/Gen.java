package Day12_Generic_Class.G2;

import Day9_Inner_Classes.Anonymous_Inner_class.I;

// JDK 5.0 Onwards 

     public class Gen <T>
      {
          T ob;

		public Gen(T ob) 
		{
			this.ob = ob;
		}

		public T getOb()
		{
			return ob;
		}
 
		public static void main(String[] args)  
		{
			Gen<Integer> iob = new Gen<Integer>(new Integer(1000));
			Integer i = iob.getOb();
			System.out.println("Integer:"+i);
			
			Gen<String> sob = new Gen<String>("Hello Darshan");
			String str = sob.getOb();
			System.out.println("String:"+str);
			
			Gen<Float> fob = new Gen<Float>(new Float(10.25f));
			Float f = fob.getOb();
			System.out.println("Float:"+f);
		 }//end main
      }//end class