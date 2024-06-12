package Day3_CW;

public class MyDate {

	   int day;
	   int month;
	   int year;
	  public MyDate()   // default constructor
	   {
		   day=1;
		   month=1;
		   year=2024;
	   }
	   public MyDate(int day,int month,int year) // Parameterized constructor
	   {
		  this.day=day;
		  this.month=month;
		  this.year=year;
	   }
	   public void printDate()
	   {
		   System.out.println("Date:"+day+"/"+month+"/"+year);
	   }
	   public static void main(String[] args) 
	   {
		   MyDate d1= new MyDate();
		   d1.printDate();
		   MyDate d2= new MyDate(2,2,2024);
		   d2.printDate();
	   }//end main
}
