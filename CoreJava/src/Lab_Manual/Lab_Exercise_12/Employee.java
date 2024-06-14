package Lab_Manual.Lab_Exercise_12;

public class Employee
{
     int eid;
     String ename;
     double basicSalary;
     double grossSalary;
     double netSalary;
     double pf;

	public Employee() 
	{

	}
	public Employee(int eid, String ename, double basicSalary) 
	{
		this.eid = eid;
		this.ename = ename;
		this.basicSalary = basicSalary;
	}
	
    public void calculateNetSalary() {
        pf = 0.12 * basicSalary;
        netSalary = basicSalary - pf;
    }

    public String toString() {
        return "Employee ID: " + eid + "\nName: " + ename + "\nBasic Salary: " + basicSalary;
    }

    public void showDetails()
    {
        System.out.println(this);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }

	
}

