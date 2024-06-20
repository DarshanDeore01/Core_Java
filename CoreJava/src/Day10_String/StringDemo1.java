package Day10_String;

public class StringDemo1
{
 public static void main(String[] args) 
 {
  String str1="Hello";
  String str2="Hello";
  String str3="hello";
  String str4=new String("Hello");
  
  //memory location check
  System.out.println("str1==str2 : "+(str1==str2)); //true 
  System.out.println("str1==str3 : "+(str1==str3)); //false
  System.out.println("str1==str4 : "+(str1==str4)); //false
  
  
  //content check  String class Method-equals
  System.out.println("str1 equals str2 : "+(str1.equals(str2))); //true 
  System.out.println("str1 equals str3 : "+(str1.equals(str3))); //false
  System.out.println("str1 equals str4 : "+(str1.equals(str4))); //true
  
  System.out.println("str1 HashCode:"+str1.hashCode()); 
  System.out.println("str2 HashCode:"+str2.hashCode());
  System.out.println("str3 HashCode:"+str3.hashCode());
  System.out.println("str4 HashCode:"+str4.hashCode());
	 

 }//end main
}//end class
