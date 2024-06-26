package Day13_Collection;

import java.util.*;

public class ArrayListDemo 
{

	public static void main(String[] args)
	{
          ArrayList<String> countries =  new ArrayList<>();
         
          countries.add("India");
          countries.add("Pakistan");
          countries.add("United States");
          countries.add("Canada");
          countries.add("Mexico");
          countries.add("Brazil");
          countries.add("Argentina");
          countries.add("United Kingdom");
          countries.add("France");
          countries.add("Germany");
          countries.add("Italy");
          countries.add("Spain");
          countries.add("Portugal");
          countries.add("Netherlands");
          countries.add("\nBelgium");
          countries.add("Sweden");
          countries.add("Norway");
          countries.add("Denmark");
          countries.add("Finland");
          countries.add("Russia");
          countries.add("China");
          countries.add("Japan");
          countries.add("South Korea");
          countries.add("Australia");
          countries.add("New Zealand");
          countries.add("South Africa");
          countries.add("Egypt");
          countries.add("Nigeria");
          countries.add("Kenya");
          countries.add("Turkey");
          countries.add("\nSaudi Arabia");
          countries.add("Iran");
          countries.add("Iraq");
          countries.add("Israel");
          countries.add("United Arab Emirates");
          countries.add("Singapore");
          countries.add("Malaysia");
          countries.add("Indonesia");
          countries.add("Thailand");
          countries.add("Vietnam");
          countries.add("Philippines");
          countries.add("Bangladesh");
          countries.add("Sri Lanka");
          countries.add("\nNepal");
          countries.add("Greece");
          countries.add("Poland");
          countries.add("Czech Republic");
          countries.add("Hungary");
          countries.add("Austria");
          
           //countries.add(null);
          //countries.add(null);
         //countries.add(null);
         
          System.out.println("Countries: "+countries);
          Collections.sort(countries);
          System.out.println();
          System.out.println("Countries: "+countries);
          
       // Using Syso
         System.out.println("\nUsing Syso");
         System.out.println("Countries: "+countries);
         countries.set(10, "Darshan");
         // Using Syso
         System.out.println("\nUsing Syso");
         System.out.println("Countries:"+countries);
         
       //Using for loop
         System.out.println("\nUsing For Loop");
         for (int i=0; i<countries.size(); i++) 
         {
			System.out.println(""+countries.get(i));
         }
         
	}

}
