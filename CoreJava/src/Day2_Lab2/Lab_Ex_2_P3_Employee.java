package Day2_Lab2;

public class Lab_Ex_2_P3_Employee {

    // Attributes
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double medical;
    private double hra;
    private double pf;
    private double pt;
    private double netSalary;
    private double grossSalary;

    // No-arguments constructor
    public Lab_Ex_2_P3_Employee() {
        // Default values
        employeeId = 0;
        employeeName = "";
        basicSalary = 0.0;
        medical = 0.0;
        calculateHRA();
        calculatePF();
        calculatePT();
        calculateGrossSalary();
        calculateNetSalary();
    }

    // Parameterized constructor
    public Lab_Ex_2_P3_Employee(int employeeId, String employeeName, double basicSalary, double medical) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.medical = medical;
        calculateHRA();
        calculatePF();
        calculatePT();
        calculateGrossSalary();
        calculateNetSalary();
    }

    // Accessor methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    // Mutator methods
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setMedical(double medical) {
        this.medical = medical;
    }

    // Method to calculate HRA
    private void calculateHRA() {
        hra = 0.5 * basicSalary;
    }

    // Method to calculate PF
    private void calculatePF() {
        pf = 0.12 * basicSalary;
    }

    // Method to calculate PT
    private void calculatePT() {
        pt = 200.0;
    }

    // Method to calculate Gross Salary
    private void calculateGrossSalary() {
        grossSalary = basicSalary + hra + medical;
    }

    // Method to calculate Net Salary
    private void calculateNetSalary() {
        netSalary = grossSalary - (pt + pf);
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
