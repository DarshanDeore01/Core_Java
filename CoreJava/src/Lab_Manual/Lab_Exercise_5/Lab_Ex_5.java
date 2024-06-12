package Lab_Manual.Lab_Exercise_5;

public class Lab_Ex_5 {
	private int day;
	private int month;
	private int year;

	public Lab_Ex_5()
	{
		this(1, 1, 2000); 
	}

	public Lab_Ex_5(int day, int month) 
	{
		this(day, month, 2000); 
	}

	public Lab_Ex_5(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void printDate() {
		System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
	}

	public static void main(String[] args) {
		Lab_Ex_5 defaultDate = new Lab_Ex_5();
		Lab_Ex_5 dateWithMonthAndDay = new Lab_Ex_5(10, 12);
		Lab_Ex_5 fullDate = new Lab_Ex_5(10, 12, 2023);

		defaultDate.printDate();
		dateWithMonthAndDay.printDate();
		fullDate.printDate();
	}
}
