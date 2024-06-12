package Lab_Manual.Lab_Exercise_8.Problem_1.Pack2;

import Lab_Manual.Lab_Exercise_8.Problem_1.Pack1.*;

public class Batch {
	public String batchName;
    private Student student;

    public Batch(String batchName, Student student) {
        this.batchName = batchName;
        this.student = student;
    }

    public void displayBatchInfo() {
        System.out.println("Batch Name: " + batchName);
        student.displayStudentInfo();
}
}