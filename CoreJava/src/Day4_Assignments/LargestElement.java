package Day4_Assignments;


/*** Java program to print the Largest element in an array ***/

public class LargestElement {

	public static void main(String[] args) {
		int num[]=new int[] {10,20,30,40};
		int max =num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i])
			{
			   max = num[i];
			}
		}
		System.out.print(max);
	}

}