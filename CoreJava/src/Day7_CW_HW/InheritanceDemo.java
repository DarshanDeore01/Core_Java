package Day7_CW_HW;

/*** Home Work Polymorphism concept Inheritance Demo Main class ***/

public class InheritanceDemo 
{

	public static void main(String[] args)
	{

		Employee e = new Employee();
		
		e= new WageEmployee(101,"Darshan",20000,5,0.8f);
		e.calculateSalary();
	    System.out.println(e.toString());
		
		e= new SalesPerson(102, "deepak",30000,6,8,12,10f);
		e.calculateSalary();
		System.out.println(e.toString());
		

	}

}