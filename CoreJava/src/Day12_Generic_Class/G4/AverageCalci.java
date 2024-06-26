package Day12_Generic_Class.G4;

public class AverageCalci <T extends Number>
{
     T [] arr;
     
     public AverageCalci(T[] arr)
     {
    	 super();
    	 this.arr=arr;
    	 
     }
     
     public double average()
     {
		double sum = 0.0 ;
		 for (int i = 0; i<arr.length;i++)
		 {
			 sum = sum+arr[i].doubleValue();
		 }
		 return sum/arr.length;
     }
     
     public static void main(String[] args) 
     {
		Integer iArr []= {10,30,50,44,58,65,47,96,25};
		AverageCalci <Integer> iob = new AverageCalci<Integer>(iArr);
		System.out.println(iob.average());
		
		Double dArr []= {23.1,52.6,45.1,78.5,96.4,475.6,568.4,78.6,52.6};
		AverageCalci <Double> dob = new AverageCalci<Double>(dArr);
		System.out.println(dob.average());
	 }
}
