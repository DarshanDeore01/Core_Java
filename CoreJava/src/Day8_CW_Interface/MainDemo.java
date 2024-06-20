package Day8_CW_Interface;

public class MainDemo 
{
      public static void main(String[] args) 
      {
    	  Printable prn;
          
    	   prn= new Employee(101,"Amit");
    	   prn.print();
    	  
    	   MyShape ref;
    	   ref= new Rectangle(4, 6);
    	   ((Rectangle)ref).print();
      }
}
