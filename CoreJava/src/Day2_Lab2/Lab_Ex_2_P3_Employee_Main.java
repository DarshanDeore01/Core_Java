package Day2_Lab2;

public class Lab_Ex_2_P3_Employee_Main {

    public static void main(String[] args) {
       
    	Lab_Ex_2_P3_Employee emp1 = new Lab_Ex_2_P3_Employee();
        
        emp1.setEmployeeId(1001);
        emp1.setEmployeeName("Darshan Deore");
        emp1.setBasicSalary(50000.0);
        emp1.setMedical(5000.0);
        
        System.out.println("Employee 1 Details:");
        emp1.displayDetails();

        
        Lab_Ex_2_P3_Employee emp2 = new Lab_Ex_2_P3_Employee(1002, "Deepak Awad", 60000.0, 6000.0);
        
        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();
    }
}
