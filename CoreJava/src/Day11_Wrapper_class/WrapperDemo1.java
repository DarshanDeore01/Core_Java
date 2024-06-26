package Day11_Wrapper_class;

public class WrapperDemo1 
{
    public static void main(String[] args)
    {
    	 //primitive to wrapper/Object type	 
    	   int n=10;
    	   Integer iob= new Integer(n);
    	   System.out.println("value of n:"+n);
    	   System.out.println("value of iob:"+iob);
    	   
    	   // Object to Primitive type
    	   int a=iob.intValue();
    	   System.out.println("value of a:"+a);
    	   
    	   // String to primitive type
    	   String s1="30";
    	   int b=Integer.parseInt(s1);
    	   System.out.println("value of b:"+b);
    	   
    	   // String to Object type
    	   String s2="306.676784";
    	   Double p =Double.parseDouble(s2);
    	   System.out.println("value of p:"+p);   

    	 
    }
}
