package Day10_String;

public class StringDemo2 
{
 public static void main(String[] args) 
 {
  String color="blue";
  
  switch (color)  // INT,CHAR   before jdk1.7
  { 			  // INT,CHAR,String   onwards jdk1.7
   case "red":
	      System.out.println("case 1 executed...");
	      break;
   case "blue":
	      System.out.println("case 2 executed...");
	      break;
   default:
	      System.out.println("default case executed...");
	       break;
  }//end switch
 }//end main
}//end class