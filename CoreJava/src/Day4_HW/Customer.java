package Day4_HW;

public class Customer {
	private static int customerCount = 0; // static counter to count customers
    private String name;

    // Constructor to initialize customer details and increment count
    public Customer(String name) {
        this.name = name;
        customerCount++;
    }

    // Static method to get the customer count
    public static int getCustomerCount() {
        return customerCount;
    }

    // Main method to create customer objects and display count
    public static void main(String[] args) {
        System.out.println("Number of customers before creation: " + Customer.getCustomerCount());

        Customer cust1 = new Customer("Darshan");
        Customer cust2 = new Customer("Deepak");
        Customer cust3 = new Customer("Aakash");

        System.out.println("Number of customers after creation: " + Customer.getCustomerCount());
    }
}
