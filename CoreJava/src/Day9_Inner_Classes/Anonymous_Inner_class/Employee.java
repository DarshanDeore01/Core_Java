package Day9_Inner_Classes.Anonymous_Inner_class;

public class Employee 
{
    int eid;
    String ename;
    int esal;

	public Employee() 
	{
		super();
		 eid=101;
	     ename="Darshan";
	     esal=10000;
	}
	public void display()
	  {
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Salary:"+esal);
	  }
}
