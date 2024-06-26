package Day12_Generic_Class.G4;

public class AverageCalci1 <T extends Number>   // Bounded Type
{
	T [] arr;
	   public AverageCalci1(T[] arr) 
		{
			super();
			this.arr = arr;
		}
		public double average()
		{
			double sum = 0.0;
			for(int i=0;i<arr.length;i++)
			{
				sum = sum + arr[i].doubleValue();
			}
			return sum/arr.length;
		}
		public boolean isSameAvg(AverageCalci1<?> ob) // wild card character
		{
			if(this.average()==ob.average())
				return true;
			return false;
		}

	public static void main(String[] args) 
	{
		Integer iArr [] = {10,40,90,70};
		AverageCalci1<Integer> iob = new AverageCalci1<Integer>(iArr);
		
		Double dArr [] = {10.0,40.0,90.0,70.0};
		AverageCalci1<Double> dob = new AverageCalci1<Double>(dArr); 
		
		if(iob.isSameAvg(dob))
			System.out.println("Same Averages");
		else
			System.out.println("Different Averages");
	}
	

}
