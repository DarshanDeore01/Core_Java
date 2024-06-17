package Day7_CW_HW;

/*** Up Casting and Down Casting Method  ***/

class Emp
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
class Mgr extends Emp
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

class SalesMgr extends Emp
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

public class Main2 {

	public static void main(String[] args) {
		
		Emp e = new Emp();
		e.m1();
		e.calSal();
		
		System.out.println("\n\n");
		
		e = new Mgr();
		e.calSal();
		((Mgr)e).m2();
		
		System.out.println("\n\n");
		
		e= new SalesMgr();
		e.calSal();
		((SalesMgr)e).m3();

	}

}