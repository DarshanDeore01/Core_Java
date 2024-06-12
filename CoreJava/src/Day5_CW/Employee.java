package Day5_CW;
import java.util.*;
public class Employee {
	
		 int eid;
		 String ename;
		 int esal;
		 public Employee()
		 {
			 eid=0;
			 ename=null;
			 esal=0;
		 }
		 public Employee(int eid,String ename,int esal)
		 {
		   this.eid=eid;
		   this.ename=ename;
		   this.esal=esal;
		 }
		 
		 public void accept()
		 {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("\nEmployee ID: ");
			 eid=sc.nextInt();
			 System.out.println("Employee Name: ");
			 ename=sc.next();
			 System.out.println("Employee Salary: ");
			 esal=sc.nextInt();
			 
		 }
		 
		 public void display()
		 {
			 System.out.println("\n\nEmployee ID: "+eid);
			 System.out.println("Employee Name: "+ename);
			 System.out.println("Employee Salary: "+esal);
		 }
		 public static void main(String[] args)
		 {
			//Employee e1= new Employee(101,"Amit",15000);
			//int num[]=new int[100];
			
			 Scanner sc = new Scanner(System.in);
			 
			 Employee emp []= new Employee [20];
			 System.out.println("How many Employees?");
			 int n=sc.nextInt();
			 System.out.println("Enter Employee Details:");
			 for(int i = 0;i<n;i++)
			 {
				 emp[i]=new Employee();
				 emp[i].accept();
			 }
			 System.out.println("Employee Details are:");
			 for(int i=0;i<n;i++)
			 {
				 emp[i].display();
			 }
			
		 }
}
