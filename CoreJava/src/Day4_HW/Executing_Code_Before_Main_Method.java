package Day4_HW;

public class Executing_Code_Before_Main_Method {
	static {
        // Code to execute before main method
        System.out.println("This is executed before the main method.");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("This is the main method.");
    }
}
