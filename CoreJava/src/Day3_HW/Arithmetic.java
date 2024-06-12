package Day3_HW;


/*** sharpen your pencil Method Overloading Airthmetic class ***/


public class Arithmetic {
	public void multiply(int a, int b)
	{
		System.out.println("The addition is:"+(a+b));
	}
	public void  multiply(int a,int b, float c)
	{
		System.out.println("The addition of three digit is"+(a+b+c));
	}
	public void multiply(float c, float d)
	{
		System.out.println("The addition of two digits are :"+(c+d));
	}
	public void multiply(double d , double l)
	{
		System.out.println("The addition is:"+(d+l));
	}
}
