package Lab_Manual.Lab_Exercise_9.Problem_2;

public class MyDate {

	int day;
	int month;
	int year;
	
	public MyDate()
	{
		day=0;
		month=0;
		year=0;
	}
	
	public MyDate(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String toString()
	{
		return " "+day+"/"+month+"/"+year;
	    //return " "+day+"/"+month+"/"+year;
	}
				
}
