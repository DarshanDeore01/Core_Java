package Day10_Clone;

public class MainDemo 
{
 public static void main(String[] args) throws CloneNotSupportedException 
 {
   Demo d1= new Demo(10,20);
   
   Demo d2=d1; // shallow clone
   
   System.out.println("d1:"+d1);
   System.out.println("d1 HashCode:"+d1.hashCode());
   System.out.println("d2:"+d2);
   System.out.println("d2 HashCode:"+d2.hashCode());
   System.out.println("\n\n");
   Demo d3=(Demo) d1.clone();
   System.out.println("d3:"+d3);
   System.out.println("d3 HashCode:"+d3.hashCode());
  }//end main
}//end class