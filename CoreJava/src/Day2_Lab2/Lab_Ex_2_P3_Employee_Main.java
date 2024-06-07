package Day2_Lab2; // Ensure the package statement matches the package name

// Import the Employee class if it's in a different package


public class Lab_Ex_2_P3_Employee_Main {

    public static void main(String[] args) {
        // Create an Employee object using the no-arguments constructor
    	Lab_Ex_2_P3_Employee emp1 = new Lab_Ex_2_P3_Employee();
        // Set employee details using mutator methods
        emp1.setEmployeeId(1001);
        emp1.setEmployeeName("Darshan Deore");
        emp1.setBasicSalary(50000.0);
        emp1.setMedical(5000.0);
        // Display employee details
        System.out.println("Employee 1 Details:");
        emp1.displayDetails();

        // Create another Employee object using the parameterized constructor
        Lab_Ex_2_P3_Employee emp2 = new Lab_Ex_2_P3_Employee(1002, "Deepak Awad", 60000.0, 6000.0);
        // Display employee details
        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();
    }
}
