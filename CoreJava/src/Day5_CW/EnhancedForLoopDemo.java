package Day5_CW;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		int num[]= {10,20,30,40,50};
		System.out.println("Array Elements Are:");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(""+num[i]);
		}
		// start,End,increment & Decrement,manual indexing
		System.out.println("Using Enhance For Loop Array Elements are:");
		for(int n:num)
		{
			System.out.println(""+n);
		}
		 // fw only --  Array of Primitive types/ Object 
	}

}
