package SUPER10Prog.Q3;
import java.util.*;

public class StudentMain 
{
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        Student[] s = new Student[10]; 

	      
	        do
	        {
	            System.out.println("1. Add Student");
	            System.out.println("2. Display All Students");
	            System.out.println("3. Display Student by Name");
	            System.out.println("4. Display Student by ID");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); 

	           
	            switch (choice)
	            {
	                case 1:
	                   
	                    System.out.print("Enter student name: ");
	                    String name = sc.nextLine();
	                    int[] marks = new int[3];
	                    System.out.println("Enter marks for 3 subjects:");
	                    for (int i = 0; i < marks.length; i++)
	                    {
	                        System.out.print("Subject " + (i + 1) + ": ");
	                        marks[i] = sc.nextInt();
	                    }
	                    for (int i = 0; i < s.length; i++) 
	                    {
	                        if (s[i] == null) 
	                        {
	                            s[i] = new Student(name, marks); 
	                            break;
	                        }
	                    }
	                    
	                case 2:
	                   
	                    System.out.println("Displaying All Students");
	                    for (Student student : s) 
	                    {
	                        if (student != null) 
	                        {
	                            student.displayDetails();
	                        }
	                    }
	                    break;
	                case 3:
	                    
	                    System.out.print("Enter student name: ");
	                    String searchName = sc.nextLine();
	                    System.out.println(" Displaying Student Details for " + searchName);
	                    for (Student student : s)
	                    {
	                        if (student != null)
	                        {
	                            student.displayDetails(searchName);
	                        }
	                    }
	                    break;
	                case 4:
	                    
	                    System.out.print("Enter student ID: ");
	                    int searchId = sc.nextInt();
	                    System.out.println("Displaying Student Details for ID: " + searchId);
	                    for (Student student : s) 
	                    {
	                        if (student != null) 
	                        {
	                            student.displayDetails(searchId); 
	                        }
	                    }
	                    break;
	                case 5:
	                    
	                    System.out.println("Exiting Program... Thank you!");
	                    break;
	                default:
	                  
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	            System.out.println(); 
	        } while (choice != 5);

	        sc.close();
	    }
	}

