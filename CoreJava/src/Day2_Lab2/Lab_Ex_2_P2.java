package Day2_Lab2;

public class Lab_Ex_2_P2 {
	
	    // Attributes
	    private int day;
	    private int month;
	    private int year;
	    
	    // Constructor - No arguments
	    public Lab_Ex_2_P2() {
	        // Initialize with default values
	        day = 1;
	        month = 1;
	        year = 2000;
	    }

	    // Parameterized Constructor
	    public Lab_Ex_2_P2(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	    // Method to display the date
	    public void displayDate() {
	        System.out.println("Date: " + day + "/" + month + "/" + year);
	    }

	    public static void main(String[] args) {
	        // Create an object using no-argument constructor
	    	Lab_Ex_2_P2 date1 = new Lab_Ex_2_P2();
	        // Print the date
	        System.out.println("Date from no-argument constructor:");
	        date1.displayDate();

	        // Create an object using parameterized constructor
	        Lab_Ex_2_P2 date2 = new Lab_Ex_2_P2(9, 6, 2024);
	        // Print the date
	        System.out.println("\nDate from parameterized constructor:");
	        date2.displayDate();
	    }
	}

