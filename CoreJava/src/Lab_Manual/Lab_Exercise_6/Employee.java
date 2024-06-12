package Lab_Manual.Lab_Exercise_6;

public class Employee {

	int eid;
	String ename;
	int esal;
	static int TotalEmployees = 0;

	public Employee()
	{
        eid=0;
		ename=null;
        esal=0;
	}
	
	public Employee(int eid, String ename,int esal)
	{
		this.eid=eid++;
		this.ename=ename;
	    this.esal=esal;
	    TotalEmployees++;
	    
	}
	
	public static int TotalEmployees()
	{
	    
		return TotalEmployees;
	}
	
	public void display()
	{
		System.out.println("Employee ID: "+eid+"\nEmployee Name: "+ename+"\nEmployee Salary: "+esal);
	}
	
	
	public static void main(String[] args)
	{
		Employee e1 =new Employee(101,"Darshan",10000);
		Employee e2 =new Employee(102,"Deepak",20000);
		Employee e3 =new Employee(103,"Akash",30000);
		
		e1.display();
		e2.display();
		System.out.println("Total Employees: " + Employee.TotalEmployees());
	}
	
	
	
}