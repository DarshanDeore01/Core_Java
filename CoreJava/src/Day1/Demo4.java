package Day1;
import java.util.Scanner;
public class Demo4 
{
public static void main(String[] args) 
{
     int a;
     int b;
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter the value of a:");
     a=sc.nextInt();
     System.out.print("Enter the value of b:");
     b=sc.nextInt();
     System.out.println("Addition is:"+(a+b));
     System.out.println("Subtarction is:"+(a-b));
     System.out.println("Multiplication is:"+(a*b));
     System.out.println("Division is:"+((float)a/b)); // int/int=int
}//end main
}