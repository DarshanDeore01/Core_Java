package Lab_Manual.Lab_Exercise_7;

public class Employee_ToString {

	 int eid;
	 String ename;
	 double medical;
	 double hra;
	 double basicSalary;
     double grossSalary;
	
	public Employee_ToString()
	{
		eid=0;
		ename=null;
		double medical;
		double hra;
		double basicSalary;
	
	}
	
	public Employee_ToString(int eid, String ename, double medical, double hra, double basicSalary)
	{
		this.eid=eid;
		this.ename=ename;
		this.medical=medical;
		this.hra=hra;
		this.basicSalary=basicSalary;
				
	}
	public double GrossSalary() 
	{
		return grossSalary = basicSalary + hra + medical;
		
	}
	
	public  String toString()
	{
		return "\nEmployee ID: "+eid+"\nEmployee Name: "+ename+"\nGross Salary: "+GrossSalary();
	}

	public static void main(String[] args) 
	{
		Employee_ToString e1 = new Employee_ToString(101,"Darshan",5000,200,30000);
	System.out.println(e1);
	}

}
