package Day8_CW_Interface;

            //Day8_3
           //interface
          //Example 1:

public class Employee implements Printable
{
	  int eid;
	  String ename;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public void print()
	{
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Name:"+ename);
	}
	  
	}


