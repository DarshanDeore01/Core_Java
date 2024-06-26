package Lab_Manual.Lab_Exercise_16;

import java.util.*;

public class CloneableDate extends Date implements Cloneable
{
	// Constructor
    public CloneableDate(long date) 
    {
        super(date);
    }
    
    // Override the clone method
    @Override
    public Object clone()
    {
        return (CloneableDate) super.clone();
    }

    public static void main(String[] args)
    {
        CloneableDate originalDate = new CloneableDate(System.currentTimeMillis());
        CloneableDate clonedDate = (CloneableDate) originalDate.clone();

        System.out.println("Original Date: " + originalDate);
        System.out.println("Cloned Date: " + clonedDate);
    }
}
