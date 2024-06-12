package Day3_CW;

public class ComplexNumber {
	int real;
	   int img;
	   public ComplexNumber()
	   {
		   real=img=0;   
	   }
	   public ComplexNumber(int real,int img)
	   {
		  this.real=real;
		  this.img=img;
	   }
	   public ComplexNumber addComplex(ComplexNumber c)
	   {
		 ComplexNumber temp=new ComplexNumber();
		 temp.real=this.real+c.real;
		 temp.img=this.img+c.img;  
		 return temp;
	   }
	      
	   public void display()
	   {
		 System.out.println(" "+real+"+"+img+"i");  
	   }
	   public static void main(String[] args) 
	   {
	      System.out.println("Addition of Complex Numbers are:");
	      ComplexNumber c1= new ComplexNumber(3,2);
	      ComplexNumber c2= new ComplexNumber(2,4);
	      ComplexNumber c3=c1.addComplex(c2);
	      System.out.print("c1: ");
	      c1.display();
	      System.out.print("c2: ");
	      c2.display();
	      System.out.print("c3: ");
	      c3.display();
	   }
}
