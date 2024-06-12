package Lab_Manual.Lab_Exercise_8.Problem_1.Pack1;

public class Student {
	public String name;
    protected int age;
    String grade; 
    private int id;

    public Student(String name, int age, String grade, int id) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.id = id;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("ID: " + id);
}
}