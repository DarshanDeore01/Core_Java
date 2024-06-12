package Day5_CW;

public class Test {

	public void m1(int x)
	{
		System.out.println("Value of X:"+x);
		x=x+5;
		System.out.println("\nValue of X:"+x);
	}
	
	public static void main(String[] args) {
		
		int n=10;
		Test t1=new Test();
		System.out.println("Before Value of N:"+n);
		
		t1.m1(n);
		System.out.println("After Value of N:"+n);

	}

}
