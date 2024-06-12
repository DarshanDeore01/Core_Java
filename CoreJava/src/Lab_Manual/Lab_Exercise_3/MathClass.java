package Lab_Manual.Lab_Exercise_3;

/*** Problem Statement 1: Construct a class. write a overloaded method add() to add integers, float and string.  ***/

public class MathClass {
	public void add(int a, int b)
	{
		 System.out.println(a+b);
	}
	public void add(float s, float f)
	{
		System.out.println(s+f);
	}
	public void add(String s, String f)
	{
		System.out.println(s+"\t"+f);
	}

	public static void main(String[] args) {
		
		MathClass mc = new MathClass();
		mc.add(10,20);
		mc.add(4.5f,3.2f);
		mc.add("John ceina","Test one");
		
	}
}
