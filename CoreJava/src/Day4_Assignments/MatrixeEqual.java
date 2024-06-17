package Day4_Assignments;

/*** Java Program to determine whether two matrices are equal ***/

public class MatrixeEqual {

	public static void main(String[] args) {
		
		int n1[][] = {{10,20},{30,40}};
		int n2[][] = {{10,20},{30,50}};
		int flag =1;
		
		for(int i=0;i<n1.length;i++)
		{
			for(int j=0;j<n2.length;j++)
			{
				
				if(n1[i][j] != n2[i][j])
				flag =0;
			}
			System.out.println();
		}
		if (flag == 1)
            System.out.print("Both the matrices are equal");
         else
            System.out.print("Both the matrices are not equal");
		

	}

}