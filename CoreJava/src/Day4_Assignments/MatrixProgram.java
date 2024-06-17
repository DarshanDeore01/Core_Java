package Day4_Assignments;
/*** Java Matrix Programs ***/

public class MatrixProgram {

	public static void main(String[] args) {
		
		int[][] n = {{10,20,30},{50,20,30},{20,30,40}};
		
		for(int i =0;i<n.length;i++)
		{
			for(int j=0;j<n.length;j++)
			{
				System.out.print(n[i][j]+" ");  
		    }
			System.out.println();
		}

	}

}