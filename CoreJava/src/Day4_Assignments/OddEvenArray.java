package Day4_Assignments;
/*** Java program to print Odd and Even Numbers from an Array ***/

public class OddEvenArray {

	public static void main(String[] args) {
		
		int a[]={1,2,5,6,3,2}; 
		System.out.println("Even numbers are:");
		for(int i =0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]);
			}
		}
		System.out.println("\n");
		System.out.println("Odd numbers are:");
		for(int i =0; i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]);
			}
		}

	}

}