package Day2_CW;

public class MyDate {
	/*
	 Program 1: Write a MyDate class with member fields day month and year.
	 and member methods are initDate use to initialize object and member method printDate
	 to display object state. 
	*/
	   int d;
	   int m;
	   int y;
	   
	   public void initDate()
	   {
		   d=1;
		   m=1;
		   y=2024;
	   }
	   public void printDate()
	   {
		System.out.println("Date:"+" "+d+"/"+m+"/"+y);	
	   }
	   public static void main(String[] args) 
	   {
	      System.out.println("d1:");
		  MyDate d1= new MyDate();   //implicit default constructor
		  d1.printDate();
		  d1.initDate();
		  d1.printDate();
		  System.out.println("d2:");
		  MyDate d2= new MyDate();   //implicit default constructor
		  d2.printDate();
		  d2.initDate();
		  d2.printDate();
		}//end main
	}//end class

