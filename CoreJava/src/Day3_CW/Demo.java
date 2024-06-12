package Day3_CW;

public class Demo {
	int x;
	  int y;
	  public Demo()
	  {
		this(10,20,0); // same class constructor
		System.out.println("Default constructor called...1 ");
	  }
	  public Demo(int x,int y)
	  {
		this.x=x;
		this.y=y;	
		System.out.println("parameterized constructor called...2 ");
	  }
	  public Demo(int x,int y, int z)
	  {
		this.x=x;
		this.y=y;	
		System.out.println("parameterized constructor called...3 ");
	  }
	  public void display()
	  {
		  System.out.println("x:"+x);
		  System.out.println("y:"+y);
	  }
	  public static void main(String[] args) 
	  {
	     Demo d1 = new Demo();
		 d1.display();
	  }//end main
}
