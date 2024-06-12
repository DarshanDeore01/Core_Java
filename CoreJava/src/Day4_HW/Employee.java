package Day4_HW;

public class Employee {
	private static int idCounter = 0; // static counter to generate unique empId
    private int empId;
    private String name;
    private float salary;

    // Constructor to initialize employee details
    public Employee(String name, float salary) {
        this.empId = ++idCounter; // auto-increment empId
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    // Main method to create and display employee objects
    public static void main(String[] args) {
        Employee emp1 = new Employee("Darshan", 50000f);
        Employee emp2 = new Employee("Deepak", 60000f);
        Employee emp3 = new Employee("Aakash", 55000f);

        System.out.println("Employee 1 details:");
        emp1.display();
        
        System.out.println("\nEmployee 2 details:");
        emp2.display();
        
        System.out.println("\nEmployee 3 details:");
        emp3.display();
    }
}
