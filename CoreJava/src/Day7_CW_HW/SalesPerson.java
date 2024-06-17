package Day7_CW_HW;

/*** Home Work Polymorphism concept Inheritance Sales Person extend Employee class ***/

public class SalesPerson extends WageEmployee 
{
	
	int sales;
	float comm;
	int total_salary;
	
	public SalesPerson()
	{
		sales = 0;
		comm = 0;
	
	}
	public SalesPerson(int eid,String name, int salary,int hours,float rate, int sales, float comm)
	{
		super(eid,name, (float) salary, hours, rate);
		this.sales = sales;
		this.comm = comm;
		
	}
	public double calculateSalary()
	{
		int s1 = (int) (comm *sales);
		return total_salary = (int) (salary+ s1);
		}
	@Override
	public String toString()
	{
		return super.toString()+"\ntotal Salary=" + total_salary;
	}
	
    
}