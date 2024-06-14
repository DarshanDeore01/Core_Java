package Day6_CW_Inheritance;


public class Emp {
	int eid;
	String ename;
	int esal;

	public Emp() {
		eid = 101;
		ename = "Darshan";
		esal = 10000;

	}

	public Emp(int eid, String ename, int esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public void dipalySalary() {
		System.out.println("\n\nEmployee ID: " + eid + "\nEmployee Name: " + ename + "\nEmployee Salary: " + esal);
		System.out.println("BSAL+HRA+DA");
	}

	
}
//
//class Emp 
//{
//	int eid;
//	String ename;
//	int esal;
//
//	public Emp()
//	{
//		eid = 101;
//		ename = "amit";
//		esal = 12000;
//	}
//
//	public void displaySalary() {
//		System.out.println("BSAL+HRA+DA");
//	}
//}
//
//class Mgr extends Emp 
//{
//	int incentives;
//
//	public Mgr() 
//	{
//		incentives = 1000;
//	}
//
//	public void displayIncentive() 
//	{
//		System.out.println("Incentives:" + incentives);
//	}
//
//
//	public static void main(String[] args) 
//	{
//		Emp e1 = new Emp();
//		e1.displaySalary();
//
//		System.out.println("\n\n");
//		Mgr m1 = new Mgr();
//		m1.displaySalary();
//		m1.displayIncentive();
//
//	}// end main
//}// end class