package Lab_Manual.Lab_Exercise_13;

/*** Problem Statement 1: create two instance of date and check whether two dates are same or not also check the has code of this date. ***/

public class MyDate
{
   
    int dd;
    int mm;
    int yy;
   
    public boolean equals(Object obj)
    {
        MyDate d =(MyDate) obj;
   
        if(this.dd != d.dd)
            return false;
        if(this.mm != d.mm)
            return false;
        if(this.yy != d.yy)
            return false;
       
        return true;
    }
   
    public MyDate()
    {
        dd=10;
        mm=10;
        yy =2002;
    }
    public MyDate(int dd, int mm, int yy)
    {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }
    public String toString()
    {
        return dd+"/"+mm+"/"+yy;
    }

    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        System.out.println("Display Dates:");
        System.out.println("d1 is: "+d1.toString());
        MyDate d2 = new MyDate(9,10,2002);
        System.out.println("d2 is: "+d2.toString());
       
        System.out.println("\nDisplay Hashcodes:");
        System.out.println("Hashcode of d1 is: "+d1.hashCode());
        System.out.println("Hashcode of d2 is: "+d2.hashCode());
       
        System.out.println("\nCheck date is equals:");
        System.out.println(d1.equals(d2) );

    }

}