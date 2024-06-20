package Day10_String;

public class StringDemo4
{
 public static void main(String[] args) 
 {
    String str1="Javavavavavavava";
    String str="va";
    System.out.println(""+str1);
    int count=0;
    for(int i=0;i<str1.length()-1;i++)
    {
     	String substr=str1.substring(i,i+2);
    	if(str.equals(substr))
    	{
    	   ++count;	
    	}
    }    
    System.out.println("Count:"+count);
 }//end main
}//end class

