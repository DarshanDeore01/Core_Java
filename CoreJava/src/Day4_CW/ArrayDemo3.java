package Day4_CW;

public class ArrayDemo3 {
	public static void main(String[] args) 
	  {
	    //int num[][]=new int[2][2]; // array declaration 
		int num[][]={{10,20},{30,40}}; // with initialization
		System.out.println("Matrix is:");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" "+num[i][j]);
			}
			System.out.print("\n");
		}
	  }// end main
}
