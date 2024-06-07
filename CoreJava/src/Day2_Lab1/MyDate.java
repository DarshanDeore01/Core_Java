package Day2_Lab1;

public class MyDate {
    // Attributes
    private int day;
    private int month;
    private int year;
    
    // Constructor
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    // Method to initialize and print date
    public void initDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        // Create a MyDate object representing a specific date
        MyDate date = new MyDate(8, 6, 2024);
        
        // Print the initialized date
        date.initDate();
    }
}

