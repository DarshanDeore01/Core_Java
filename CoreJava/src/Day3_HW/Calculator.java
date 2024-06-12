package Day3_HW;


/*** sharpen your pencil Method Overloading Airthmetic class with Calculator main class ***/


public class Calculator {
	
	public static void main(String[] args) {
			
		Arithmetic a1 = new Arithmetic();
			a1.multiply(10, 20);
			a1.multiply(10, 20, 3.5f);
			a1.multiply(10.5f, 20.0f);
			a1.multiply(10l, 20l);
}
}
