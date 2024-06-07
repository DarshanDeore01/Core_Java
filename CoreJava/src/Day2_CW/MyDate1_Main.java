package Day2_CW;
public class MyDate1_Main {
   
	public static void main(String[] args) 
	 {
		MyDate1 d1= new MyDate1();  //d[d/m/y]
	   d1.setDay(12);
	   d1.setMonth(1);
	   d1.setYear(2024);
	   System.out.println("Date:");
	   System.out.println(d1.getDay()+"/"+d1.getMonth()+"/"+d1.getYear());   
		 
	 }//end main
	}//end class

