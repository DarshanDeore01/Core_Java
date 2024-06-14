package Lab_Manual.Lab_Exercise_12;

public class Manager extends Employee
{
     double petrolAllowance;
     double foodAllowance;
     double otherAllowance;
     double grossSalary;

    public Manager(int empId, String name, double basicSalary) 
    {
        super(empId, name, basicSalary);
        petrolAllowance = 0.08 * basicSalary;
        foodAllowance = 0.13 * basicSalary;
        otherAllowance = 0.03 * basicSalary;
    }

    public double calculateGrossSalary() 
    {
        grossSalary = basicSalary + petrolAllowance + foodAllowance + otherAllowance;
        return grossSalary;
    }

    public void calculateNetSalary() 
    {
        super.calculateNetSalary();
        
    }
    @Override
    public void showDetails() 
    {
    super.showDetails();
    calculateGrossSalary();
    calculateNetSalary();
    
    }
}
