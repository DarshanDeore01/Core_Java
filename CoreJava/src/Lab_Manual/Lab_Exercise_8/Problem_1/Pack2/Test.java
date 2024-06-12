package Lab_Manual.Lab_Exercise_8.Problem_1.Pack2;
 import Lab_Manual.Lab_Exercise_8.Problem_1.Pack1.*;

public class Test {
	public static void main(String[] args) {
        Student student = new Student("Darshan", 20, "A", 101);
        Batch batch = new Batch("Batch 1", student);

        System.out.println("Student Information:");
        student.displayStudentInfo();

        System.out.println("\nBatch Information:");
        batch.displayBatchInfo();
}
}