package Day7_CW_HW;

/*** Home Work Polymorphism concept WageEmployees Sales Person extend Employee class ***/

public class WageEmployee extends Employee
{
	
	int hours;
	float rate;
	double  total_salary;
	
	public WageEmployee()
	{
		super();
		hours =0;
		rate =0;
	}
	public WageEmployee(int eid,String name, float salary,int hours, float rate)
	{
		super(eid,name, salary);
		this.hours =hours;
		this.rate =rate;
	}
	@Override
	public double calculateSalary()
	{
		 return total_salary = (float) salary*(hours*rate);
	}
	@Override
	public String toString() 
	{
		return 
				super.toString()+"\ntotal_Salary : "+total_salary ;
	}

}