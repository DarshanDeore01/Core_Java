package Lab_Manual.Lab_Exercise_10;

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
		  public MyDate(int day,int month,int year)
		  {
			  this.day=day;
			  this.month=month;
			  this.year=year;
		  }
		  @Override
		  public String toString() 
		  {
		    return " "+day+"/"+month+"/"+year;
		  }
}
