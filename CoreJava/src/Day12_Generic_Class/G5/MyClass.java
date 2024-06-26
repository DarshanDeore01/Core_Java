package Day12_Generic_Class.G5;

public class MyClass 
{

		public static void aMethod(Gen<?> ob)
		{
			System.out.println(ob.getOb());
		}
		
		public static void main(String[] args) 
		{
			Gen<Integer> iob = new Gen<Integer>(100);
			aMethod(iob);
			
			Gen<String> sob = new Gen<>("Hello World!");
			aMethod(sob);
		}
}


