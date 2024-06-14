package SUPER10Prog.Q3;

public class Student 
{
	    
	    int studentId; 
	    String studentName; 
	    int[] marks = new int[3]; 
	    double average; 
	    char grade;

	    
	    static int nextId = 1; 

	    
	    public Student()
	    {
	        this.studentId = nextId++; 
	    }

	    
	    public Student(String name, int[] marks) 
	    {
	        this(); 
	        this.studentName = name; 
	        this.marks = marks; 
	        calculateAverage(); 
	        assignGrade();
	    }

	    
	    public void calculateAverage() 
	    {
	        int sum = 0; 
	        for (int mark : marks) 
	        { 
	            sum += mark; 
	        }
	        this.average = (double) sum / marks.length; 
	    }

	   
	    public void assignGrade()
	    {
	        if (average >= 80) 
	        {
	            this.grade = 'A'; 
	        } else if (average >= 60)
	        {
	            this.grade = 'B'; 
	        } else if (average >= 40) 
	        {
	            this.grade = 'C'; 
	        } else 
	        {
	            this.grade = 'F';
	        }
	    }

	    
	    public void displayDetails() {
	        System.out.println("Student ID: " + studentId); 
	        System.out.println("Student Name: " + studentName); 
	        System.out.println("Marks:"); 
	        for (int i = 0; i < marks.length; i++)
	        {
	            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
	        }
	        System.out.println("Average: " + average); 
	        System.out.println("Grade: " + grade); 
	        System.out.println(); 
	    }

	    
	    public void displayDetails(String name) 
	    {
	        if (studentName.equalsIgnoreCase(name))
	        { 
	            displayDetails(); 
	        }
	    }

	   
	    public void displayDetails(int id)
	    {
	        if (studentId == id) 
	        { 
	            displayDetails(); 
	        }
	    }

	    
	    public int getStudentId() {
	        return studentId; 
	    }

	    public String getStudentName() {
	        return studentName;
	    }

	    
	    public static int getNextId() {
	        return nextId; 
	    }
}


