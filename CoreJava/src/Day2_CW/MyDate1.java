package Day2_CW;

public class MyDate1 {
	private int day;
	 private int month;
	 private int year;
	  //Mutator Method / setter method	
	  public void setDay(int d)
	  {
		  day=d;
	  }
	  //Accessor Method / getter method
	  public int getDay()
	  {
		  return day;
	  }
	  //Mutator Method / setter method	
	  public void setMonth(int m)
	  {
		  month=m;
	  }
	  //Accessor Method / getter method
	  public int getMonth()
	  {
		  return month;
	  }
	//Mutator Method / setter method	
	  public void setYear(int y)
	  {
		  year=y;
	  }
	  //Accessor Method / getter method
	  public int getYear()
	  {
		  return year;
	  }
	  
	  
	   public void initDate()
	    {
			   day=1;
			   month=1;
			   year=2024;
	    }
	   public void printDate()
	   {
			System.out.println("Date:"+" "+day+"/"+month+"/"+year);	
	   }
	}//end class


 