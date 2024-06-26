package Lab_Manual.Lab_Exercise_18;

public class StringBuilderDemo 
{
    public static void main(String[] args)
    {
    	// Initialize a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append method
        sb.append(" World");
        System.out.println("After append: " + sb.toString());

        // Insert method
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb.toString());

        // Replace method
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb.toString());

        // Delete method
        sb.delete(6, 13);
        System.out.println("After delete: " + sb.toString());

        // Reverse method
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // Length method
        int length = sb.length();
        System.out.println("Length: " + length);

        // Capacity method
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity);

        // Substring method
        String substring = sb.substring(3, 7);
        System.out.println("Substring (3, 7): " + substring);

        // IndexOf method
        int indexOf = sb.indexOf("o");
        System.out.println("Index of 'o': " + indexOf);

        // CharAt method
        char charAt = sb.charAt(2);
        System.out.println("Character at index 2: " + charAt);
    }
	
}
