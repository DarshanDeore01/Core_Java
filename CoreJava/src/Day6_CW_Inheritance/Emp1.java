package Day6_CW_Inheritance;

//Subclass Constructor
//Emp->Mgr
public class Emp1 
{
	int n;

	public Emp1() {
		n = 10;
      System.out.println("Parent class Default Constructor ");
	}
	public Emp1(int n) {
		this.n = n;
      System.out.println("Parent class Parameterized Constructor ");
	}
}
