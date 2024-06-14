package Lab_Manual.Lab_Exercise_12;

public class Main {
	public static void showDetails(Employee e) 
	{
        System.out.println(e);
      
        if (e instanceof Manager)
        {
            Manager m = (Manager) e;
            System.out.println("Gross Salary is: " + m.calculateGrossSalary());
            m.calculateNetSalary();
            System.out.println("Net Salary is: " + m.netSalary);
        } else if (e instanceof MarketingExecutive) 
        {
            MarketingExecutive me = (MarketingExecutive) e;
            System.out.println("Gross Salary is: " + me.calculateGrossSalary());
            me.calculateNetSalary();
            System.out.println("Net Salary is: " + me.netSalary);
        }
    }

    public static void main(String[] args) 
   {

        System.out.println("1. Manager\n2. MarketingExecutive");
        int choice = 1; 

        switch (choice) {
            case 1:
                showDetails(new Manager(101, "Darshan", 50000));
                break;
            case 2:
                showDetails(new MarketingExecutive(102, "Divyam", 30000, 200));
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
