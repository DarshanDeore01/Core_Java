package Day2_Lab2;

public class Lab_Ex_2_P3_Employee {

   
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double medical;
    private double hra;
    private double pf;
    private double pt;
    private double netSalary;
    private double grossSalary;

    
    public Lab_Ex_2_P3_Employee() {
       
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

    
    private void calculateHRA() {
        hra = 0.5 * basicSalary;
    }

    
    private void calculatePF() {
        pf = 0.12 * basicSalary;
    }

  
    private void calculatePT() {
        pt = 200.0;
    }

   
    private void calculateGrossSalary() {
        grossSalary = basicSalary + hra + medical;
    }

   
    private void calculateNetSalary() {
        netSalary = grossSalary - (pt + pf);
    }

   
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
