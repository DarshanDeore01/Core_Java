package Day3_CW;

public class MathEngin {
	public void add(int a,int b)
	   {
		   System.out.println("Addition is:"+(a+b));
	   }
	   public void add(int a,float b)
	   {
		   System.out.println("Addition is:"+(a+b));
	   }
	   public void add(int a,int b,int c,int d)
	   {
		   System.out.println("Addition is:"+(a+b+c+d));
	   }
	 public static void main(String[] args) 
	 {
	    MathEngin ob= new MathEngin();
	    ob.add(1,2);
	    ob.add(1,2.0f);
	    ob.add(1,2,3,4);

	 }
}
