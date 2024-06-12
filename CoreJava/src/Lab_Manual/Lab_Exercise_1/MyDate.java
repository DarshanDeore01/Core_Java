package Lab_Manual.Lab_Exercise_1;

public class MyDate {
    
    private int day;
    private int month;
    private int year;
    
        public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
           public void initDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
     
        MyDate date = new MyDate(8, 6, 2024);
        date.initDate();
    }
}

