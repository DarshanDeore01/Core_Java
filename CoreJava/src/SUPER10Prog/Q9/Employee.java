package SUPER10Prog.Q9;

public class Employee
{
	
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double HRA;
    private double PF;
    private double PT;
    private double netSalary;
    private double grossSalary;

   
    private static int nextEmployeeId = 101; 

    
    public Employee(String employeeName, double basicSalary)
    {
        this.employeeId = nextEmployeeId++;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    
    public void calculateSalary() 
    {
        HRA = 0.5 * basicSalary; 
        PF = 0.12 * basicSalary; 
        PT = 200; 
        grossSalary = basicSalary + HRA;
        netSalary = grossSalary - (PF + PT);
    }

   
    public void printDetails() 
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("PT: " + PT);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }

    
    public int getEmployeeId()
    {
        return employeeId;
    }

   
    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) 
    {
        this.employeeName = employeeName;
    }

    
    public double getBasicSalary()
    {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) 
    {
        this.basicSalary = basicSalary;
    }

    
    public double getNetSalary() 
    {
        return netSalary;
    }

    
    public double getGrossSalary() 
    {
        return grossSalary;
    }

    
    public static void main(String[] args)
    {
      
        Employee emp = new Employee("Darshan", 50000);
        emp.calculateSalary();

        System.out.println("Employee Details:");
        emp.printDetails();
    }
}
