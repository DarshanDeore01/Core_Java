package Day10_String;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("Capacity: " + sb.capacity()); //16
		sb.append("welcome");//7 char
	    System.out.println(sb);
		System.out.println("Capacity: " + sb.capacity());//16
		sb.append("Java is ob");//10
		System.out.println("Capacity: " + sb.capacity());//34
		sb.append("welcome Java is obob");
		System.out.println("Capacity: " + sb.capacity());//70
		
		System.out.println(sb);
		
		System.out.println("Length: " + sb.length());
		
		sb.trimToSize();
		
		System.out.println("Capacity: " + sb.capacity());
		
		sb.reverse();
		
		System.out.println(sb);
    
		
		
	}

}

