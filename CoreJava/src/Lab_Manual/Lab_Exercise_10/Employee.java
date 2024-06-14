package Lab_Manual.Lab_Exercise_10;

public class Employee 
{
 int eid;
 String ename;
 int esal;
 MyDate doj;
 public Employee() 
 {
    eid=101;
    ename="amit";
    esal=10000;
    doj=new MyDate(1,1,2001);
 }
 public Employee(int eid,String ename,int esal,MyDate dob) 
 {
    this.eid=eid;
    this.ename=ename;
    this.esal=esal;
    this.doj=dob;
 }
 public void display()
 {
	 System.out.println("\n\nEmployee Id:"+eid);
	 System.out.println("Employee Name:"+ename);
	 System.out.println("Employee Salary:"+esal);
	 System.out.println("Employee DOB:"+doj);
 }
	
 public static void main(String[] args) 
 {
   Employee e1= new Employee();
   e1.display();
   
   Employee e2= new Employee(102, "Sumit",12000,new MyDate(2,2,2002));
   e2.display();

 }
}