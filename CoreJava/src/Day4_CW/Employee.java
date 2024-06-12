package Day4_CW;

public class Employee {
	int eid; 
	String ename;
	int esal;
	static int count=0;
	static int TotalEmployees=0;

	static { // static block 1
		count = 0;
		System.out.println("static block 1...");
	}

	static { // static block 2
		System.out.println("static block 2...");
	}

	public Employee() {
		eid = ++count;
		ename = null;
		esal = 0;
	}

	public Employee(String ename, int esal) {
		this.eid = ++count;
		this.ename = ename;
		this.esal = esal;
	}

	public void display() // instance method
	{
		System.out.println("\n\nEmployee Id:" + eid);
		System.out.println("Employee Name:" + ename);
		System.out.println("Employee Salary:" + esal);

	}

	public static void displayCnt() // static method
	{
		System.out.println("Employee Count:" + count);

	}

	static { // static block 3
		System.out.println("static block 3...");
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Amit", 15000);
		Employee e2 = new Employee("Sumit", 25000);
		Employee e3 = new Employee("Ajit", 18000);

		e1.display();
		e2.display();
		e3.display();
		Employee.displayCnt();

	}// end main

	static { // static block 4
		System.out.println("static block 4...");
	}
}
