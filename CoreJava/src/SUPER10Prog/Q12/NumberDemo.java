package SUPER10Prog.Q12;
import java.util.*;
public class NumberDemo 
{
	int Num;
     
	public NumberDemo()
	{
		Num=0;
    }

     public boolean isPrime (int Num)
     {
    	if(Num<=2)
    	{
    		return false;
    	}
    	for(int i=2; i<Num;i++)
    	{
    		if (Num % i == 0)
    		{
    			return false;
    		}
    	}
    	   return true;
      }
     
     public void factorial (int Num)
     {
    	 int result =1 ;
    	 for(int i=1; i<Num;i++)
    	 {
    		 result*=i;
    	 }
    	 System.out.println("Factorial of Number: "+Num+" "+result);
     }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int Num = sc.nextInt();
		NumberDemo nd = new NumberDemo();
		
		boolean isPrime = false;
		nd.isPrime(Num);
		System.out.println("Is The Number Prime ? "+nd.isPrime(Num));
		 
		nd.factorial(Num);

	}

}
