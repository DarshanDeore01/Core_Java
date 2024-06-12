package Lab_Manual.Lab_Exercise_8.Problem_2;
import Lab_Manual.Lab_Exercise_8.Problem_1.Pack1.Student;
public class Batch {
	 public String batchName;
	    private Student student;

	    public Batch(String batchName, Student student) {
	        this.batchName = batchName;
	        this.student = student;
	    }

	    public void displayBatchInfo() {
	        System.out.println("Batch Name: " + batchName);

	        // Accessing Student class attributes
	        System.out.println("Accessing Student attributes from Batch:");
	        System.out.println("Public Name: " + student.name);
	        
	        // Protected and default attributes are not accessible from a different package without inheritance
	        // System.out.println("Protected Age: " + student.age); // Not accessible
	        // System.out.println("Default Grade: " + student.grade); // Not accessible
	        // System.out.println("Private ID: " + student.id); // Not accessible

	        student.displayStudentInfo();
	    }
}

