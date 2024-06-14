package Day6_CW_Inheritance;

public class Mgr1 extends Emp1
{
		int m;
		public Mgr1() {
			m = 20;
			System.out.println("Child class Default Constructor ");
		}

		public Mgr1(int m) {
			this.m = m;
			System.out.println("Child class Parametrized Default Constructor ");
		}

		public void dipaly() 
		{
			System.out.println("\nN: "+n);
			System.out.println("\nM: "+m);
				}

	}

