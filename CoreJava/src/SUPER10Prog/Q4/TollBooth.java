package SUPER10Prog.Q4;

public class TollBooth 
{
	    private int totalCars;
	    private double totalCash;

	    
	    public TollBooth() 
	    {
	        totalCars = 0;
	        totalCash = 0.0;
	    }

	    
	    public void payingCar()
	    {
	        totalCars++;
	        totalCash += 50.0;
	        System.out.println("Car passed and paid toll of 50 Rs.");
	    }


	    public void nopayCar()
	    {
	        totalCars++;
	        System.out.println("Car passed without paying toll.");
	    }



	    public void display() 
	    {
	        System.out.println("\nToll Booth Stats:");
	        System.out.println("Total cars passed: " + totalCars);
	        System.out.println("Total cash collected: Rs. " + totalCash);
	    }



	    public static void main(String[] args) 
	    {
	        TollBooth toll = new TollBooth();

	        toll.payingCar();   
	        toll.nopayCar();   
	        toll.payingCar();   
	        toll.payingCar();   
	        toll.nopayCar();   
	        toll.payingCar(); 
	        toll.payingCar(); 
	        toll.payingCar(); 
	        toll.nopayCar();   
	        toll.nopayCar();   
	        toll.nopayCar();   
	        toll.nopayCar();   
	        toll.nopayCar();   
	        toll.display();   

	    }
}
