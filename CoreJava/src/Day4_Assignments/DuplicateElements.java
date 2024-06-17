package Day4_Assignments;

/** Java Program to print the duplicate elements of an array **/

public class DuplicateElements {

	public static void main(String[] args) {
		
		int arr[] = {1,1,2,3,4,5,5,6};
		System.out.print("Duplicate Elements are:\n");
		
		for (int i = 0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[j]+" ");
				}
			}
		}
		

	}

}