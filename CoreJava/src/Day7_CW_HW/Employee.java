package Day7_CW_HW;

/*** Home Work Polymorphism concept Employee Main class ***/

public class Employee
{
	int eid;
	String name;
	double salary;
	
	public Employee()
	{
	    eid=0;
		name =null;
		salary = 0;
	}
	public Employee(int eid,String name, double salary)
	{
		this.eid=eid;
		this.name  = name;
		this.salary = salary;
	}
	public String toString()
	{
		return "\nEmployee Id :" +eid+ "\nEmployee Name: "+name+"\nSalary is: "+salary;
	}
	public double calculateSalary() 
	{
			return 0;
	}
	

}
