package Day1;
import java.util.Scanner;
public class Demo3 {
	 public static void main(String[] args) 
	  {
		 // Student s1= new Student();
		  Scanner sc= new Scanner(System.in);
		  System.out.print("Enter Integer Value:");
	      int n = sc.nextInt();

	      System.out.print("Enter Float Value:");
	      float m = sc.nextFloat();
	      
	      System.out.print("Enter Double Value:");
	      double p = sc.nextDouble();
	            
	      System.out.print("Enter String Value(Single word):");
	      String str1 = sc.next();  //Sachin
	      
	      sc.nextLine(); // \n
	      System.out.print("Enter String Value(Multi word):");
	      String str2 = sc.nextLine();// Sachin Tendulkar
	      
	      System.out.print("Enter char Value:");
	      char ch= sc.next().charAt(0);  // S     
	      
	      
	      System.out.println("Value of n:"+n);
	      System.out.println("Value of m:"+m);
	      System.out.println("Value of p:"+p);
	      System.out.println("Value of str1(Single-Word):"+str1);
	      System.out.println("Value of str2(Multi-Word):"+str2);
	      System.out.println("Value of ch:"+ch);
	       	      	     	 
  }//end main
}
