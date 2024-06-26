package Lab_Manual.Lab_Exercise_18;
import java.util.*;
public class Calculator 
{
	public static void main(String[] args) 
{

  String choice=null;
  int n1,n2,n3;
  
  do
  {
	 System.out.println("Enter Number n1: "); 
	 Scanner sc = new Scanner(System.in);
	 n1=sc.nextInt();
    
	 System.out.println("Enter Number n2: "); 
	 n2=sc.nextInt();
	 
	 System.out.println("1) Add "
             + "\n2) Substract"
             + "\n3) Multiply"
             + "\n4) Divide"
             + "\n5) Exit");
	 choice = sc.next();
	 
	 switch (choice)
	 {
	 case "Add":
		 n3=n1+n2;
		 System.out.println(n3);
		 break;
		 
	 case "Substract":
		 n3=n1-n2;
		 System.out.println(n3);
		 break;
		 
	 case "Multiply":
		 n3=n1*n2;
		 System.out.println(n3);
		 break;
		 
	 case "Divide":
		 n3=n1/n2;
		 System.out.println(n3);
		 break;
		 
	 case "Exit":
		 break;
		
	 }
	 	
  }while(choice != null);
    
    
}
}
