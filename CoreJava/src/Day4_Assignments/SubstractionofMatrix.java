package Day4_Assignments;

/*** Java Program to subtract the two matrices ***/

public class SubstractionofMatrix {

	public static void main(String[] args) {
		
		int n1[][] = {{10,20},{30,40}};
		int n2[][] = {{30,60},{40,50}};
		int n3[][] = new int[2][2];
		
		for(int i=0;i<n1.length;i++)
		{
			for(int j=0;j<n2.length;j++)
			{
				n3[i][j] = n1[i][j] - n2[i][ j];
				System.out.print(n3[i][j]+" ");  
			}
			System.out.println();
		}

	}

}