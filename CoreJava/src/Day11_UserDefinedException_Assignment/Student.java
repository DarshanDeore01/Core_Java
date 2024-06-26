package Day11_UserDefinedException_Assignment;
import java.util.Scanner;


class NameException extends Exception
{
	String msg;
 public NameException(String msg)
 {
     super(msg);
     this.msg=msg;
 }
}

class AgeException extends Exception
{
	String msg;
 public AgeException(String msg) 
 {
	 super(msg);
     this.msg=msg;
 }
}


class Student
{
 private int studentId;
 private String name;
 private int age;

 
 public Student() 
 {
     this.studentId = 0;
     this.name = "";
     this.age = 0;
 }

 
 public Student(int studentId, String name, int age) 
 {
	this.studentId = studentId;
	this.name = name;
	this.age = age;
 }


public void acceptData() throws NameException, AgeException 
 {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter student ID: ");
     this.studentId = sc.nextInt();
     sc.nextLine();

     System.out.print("Enter name: ");
     this.name = sc.nextLine();
     if (!isValidName(this.name))
     {
         throw new NameException("Invalid name: Name must only contain alphabets and spaces");
     }

     System.out.print("Enter age: ");
     this.age = sc.nextInt();
     if (this.age <= 18) 
     {
         throw new AgeException("Invalid age: Age must be greater than 18");
     }

     
 }

  public void displayData()
 {
     System.out.println("Student ID: " + this.studentId);
     System.out.println("Name: " + this.name);
     System.out.println("Age: " + this.age);
 }

 
 private boolean isValidName(String name)
 {
     return name.matches("[a-zA-Z\\s]+");
 }

 
 public static void main(String[] args)
 {
     Student student = new Student();
     try 
     {
         student.acceptData();
         student.displayData();
     } 
     catch (NameException | AgeException e) 
     {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
