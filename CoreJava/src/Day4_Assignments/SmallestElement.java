package Day4_Assignments;


/*** Java program to print the Smallest element in an array ***/

public class SmallestElement {

	public static void main(String[] args) {
		
		int num[]=new int[] {10,20,30,40};
		int min =num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(min > num[i])
			{
			   min = num[i];
			}
		}
		System.out.print(min);

	}

}