package Day5_HW;

public class ArrayDemo {
	
    public static void display(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
       
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;  
        }

        // Displaying the int array using forEach loop
        System.out.println("Displaying int array:");
        for (int num : intArray) {
            System.out.println(num);
        }

        // Creating an array of 5 floats using first class object notation
        float[] floatArray = new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        // Displaying the float array using forEach loop
        System.out.println("Displaying float array:");
        for (float num : floatArray) {
            System.out.println(num);
        }

        // Calling the display() method by passing an array of int type
        System.out.println("Displaying int array using display() method:");
        display(intArray);

        // Calling the display() method by passing a comma separated list of int type values
        System.out.println("Displaying comma separated int values using display() method:");
        display(10, 20, 30, 40, 50);
    }
}
