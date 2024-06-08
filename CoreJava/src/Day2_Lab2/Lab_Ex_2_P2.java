package Day2_Lab2;

public class Lab_Ex_2_P2 {
	
	  
	    private int day;
	    private int month;
	    private int year;
	    
	    
	    public Lab_Ex_2_P2() {
	        
	        day = 1;
	        month = 1;
	        year = 2000;
	    }

	    
	    public Lab_Ex_2_P2(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	   
	    public void displayDate() {
	        System.out.println("Date: " + day + "/" + month + "/" + year);
	    }

	    public static void main(String[] args) {
	       
	    	Lab_Ex_2_P2 date1 = new Lab_Ex_2_P2();
	        
	        System.out.println("Date from no-argument constructor:");
	        date1.displayDate();

	        
	        Lab_Ex_2_P2 date2 = new Lab_Ex_2_P2(9, 6, 2024);
	       
	        System.out.println("\nDate from parameterized constructor:");
	        date2.displayDate();
	    }
	}

