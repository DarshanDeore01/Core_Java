package Day10_String;
public class StringBuilderDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("hello");
		//StringBuilder sb = new StringBuilder("hello");
		
		System.out.println("Capacity: " + sb.capacity());
		
		sb.append(" welcome");
		
		System.out.println(sb);
		
		System.out.println("Length: " + sb.length());
		
		sb.trimToSize();
		
		System.out.println("Capacity: " + sb.capacity());
		
		sb.reverse();
		
		System.out.println(sb);
	}

}
