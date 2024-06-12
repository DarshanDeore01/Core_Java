package Lab_Manual.Lab_Exercise_2;

public class Lab_Ex_2_P1 {
	
    private int day;
    private int month;
    private int year;
    
    
    public Lab_Ex_2_P1() {
        
        day = 1;
        month = 1;
        year = 2000;
    }

    
    public Lab_Ex_2_P1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab_Ex_2_P1 date1 = new Lab_Ex_2_P1();
        date1.setDay(8);
        date1.setMonth(6);
        date1.setYear(2024);
        System.out.println("Date from accessor methods:");
        System.out.println("Day: " + date1.getDay());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Year: " + date1.getYear());
        date1.displayDate();
        Lab_Ex_2_P1 date2 = new Lab_Ex_2_P1(9, 6, 2024);
        System.out.println("\nDate from parameterized constructor:");
        date2.displayDate();
    }
	}


