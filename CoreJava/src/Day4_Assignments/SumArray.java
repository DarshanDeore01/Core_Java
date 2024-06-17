package Day4_Assignments;
import java.util.*;
/*** Java program to print the sum of all the items of the array ***/

public class SumArray {

	public static void main(String[] args) {
		
		System.out.println("Enter number of elements:");
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int num[]= new int[num1];
		System.out.println("Enter elements:");
		Scanner sc1 = new Scanner(System.in);
		int sum =0;
		 for(int i=0;i<num.length;i++)
		    {
		 	  num[i]=sc.nextInt();
		 	  sum=sum+num[i];
		    }
		System.out.println("The sum of array is : "+sum);
		

	}

}