package Lab_Manual.Lab_Exercise_4;

public class MathClass 
{
      public void Addition(int ...a)
      {
    	  int sum=0;
    	  for(int x:a)
    	  {
    		  sum+=x;
    		
    	  }
    	  System.out.println("\nAddition Is : "+sum);
      }
		public static void main(String[] args)
	{
			MathClass A = new MathClass();
		     A.Addition(1,2);
		     A.Addition(1,2,3);
		     A.Addition(1,2,3,4);
		     A.Addition(1,2,3,4,5);
		     A.Addition(1,2,3,4,5,6);
		     A.Addition(1,2,3,4,5,6,7);
		     A.Addition(1,2,3,4,5,6,7,8);

	}

}
