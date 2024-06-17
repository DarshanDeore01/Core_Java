package Day4_Assignments;

/** Java Program to left rotate the elements of an array **/

public class LeftRotate {

	public static void main(String[] args) {
		
		int n1[] = {1, 2, 3, 4, 5};
		
		int n=3;
		
		System.out.println("Original Elements are:");
		for(int a : n1)
		{
			System.out.println(a);
		}
		for(int i=0;i<n;i++)
		{
			int j, first;
			
			first = n1[0];
			for(j=0;j<n1.length-1;j++)
			{
				n1[j]=n1[j+1];
			}
			n1[j]=first;
		}
		System.out.println();
		
		System.out.println("Array after left rotation");
		
		for(int i =0;i<n1.length;i++)
		{
			System.out.print(n1[i]+" ");
		}
		
		

	}

}