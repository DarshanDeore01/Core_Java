package Day4_Assignments;

/*** Java program to copy all of elements of one array to another array ***/

public class OneConvertTwo {

	public static void main(String[] args) {
	
		int num[] = new int[] {10,20,30,40,50};
		int num1[] = new int[num.length];
		
		for(int i =0;i<num.length;i++)
		{
		num1[i]=num[i];	
		}
		
		System.out.println("Elements in original array: ");
		for(int i =0;i<num.length;i++)
		{
			System.out.println(num[i]+" ");
		}
		
		System.out.println("Elements in Duplicate array: ");
		for(int i =0;i<num1.length;i++)
		{
			System.out.println(num1[i]+" ");
		}

	}

}
