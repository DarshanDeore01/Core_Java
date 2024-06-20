package Day10_Covariant_Data_Type;

class Emp
{
	
}
class Mgr extends Emp
{
	
}
class SalesMgr
{

}

class T1
{
   public Emp getObj()
   {
	   return new Emp();
   }
}
class T2 extends T1
{
   @Override	
   public Mgr getObj()
   {
	   return new Mgr();
   }
}



public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
