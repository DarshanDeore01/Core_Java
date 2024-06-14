package Day6_CW_Inheritance;

public class InheritanceDemo1Main
{

	public static void main(String[] args) 
	{
		Emp e1 =new Emp();
		e1.dipalySalary();
		
		System.out.println("\n\n");
        Mgr m1 = new Mgr();
        m1.dipalySalary();
        m1.dipalyIncentives();
			
	}

}
