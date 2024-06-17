package Day7_CW_HW;

import java.util.Scanner;

/*** Run Time Type Identification Example (instance of)  ***/

class Emp1
{
  public void m1()
  {
   System.out.println("Emp class m1() method is called...");	 
  }
  public void calSal()
  {
	  System.out.println("BSAL+HRA+DA");
  }
}
class Mgr1 extends Emp1
{
  public void m2()
  {
   System.out.println("Mgr class m2() method is called...");	 
  }
  @Override
  public void calSal()
  {
    System.out.println("BSAL+HRA+DA+Incentives");
  }
}

class SalesMgr1 extends Emp1
{
  public void m3()
  {
   System.out.println("SalesMgr class m3() method is called...");	 
  }
  @Override
  public void calSal()
  {
    System.out.println("BSAL+HRA+DA+Comm");
  }
}

public class Polyorphisminstance {
	public static void display(Emp e)
	{
		e.m1();
		e.calSal();
		
		if(e instanceof Mgr)
		{
			((Mgr)e).m2();
		}
		if(e instanceof SalesMgr)
		{
			((SalesMgr)e).m3();
		}
		
	}


	public static void main(String[] args) {
		int choice =0;
		
		Emp e =null;
		
		
		do
		{
		System.out.println("1) Employee \n"
				+ "2)Manager \n"
				+ "3)Sales Manager ");
		System.out.println("select chooice: ");
		Scanner sc = new Scanner(System.in);
		choice  = sc.nextInt();
		
		switch(choice)
		{
		
		case 1: 
			e= new Emp();
			display(e);
			break;
			
		case 2:
			e = new Mgr();
			display(e);
			break;
			
		case 3:
			e = new SalesMgr();
			display(e);
			break;
			
			default :
				System.out.println("Invalid Choice");
		}
		}while(choice != 0);

	}

}
