package Day6_CW_Inheritance;

public class Mgr extends Emp
{
	
		int incentives;

		public Mgr() {
			incentives = 500;
		}

		public Mgr(int incentives) {
			this.incentives = incentives;
		}

		public void dipalyIncentives() {

			System.out.println("\nIncentives" + incentives);
		}

	}

