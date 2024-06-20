package Day10_String;

public class StringDemo3
{
 public static void main(String[] args) 
 {
   String str1="Hello World ! Welcome to String";
   System.out.println("String length:"+str1.length()); 
   System.out.println("String uppercase:"+str1.toUpperCase());
   System.out.println("String Lowercase:"+str1.toLowerCase());
   System.out.println("String substring 5 to end:"+str1.substring(5,str1.length()));
 }//end main
}//end class
