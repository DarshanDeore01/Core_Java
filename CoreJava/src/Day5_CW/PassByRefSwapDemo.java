package Day5_CW;

public class PassByRefSwapDemo {

	public static void swap(MyDate md[]) {
		MyDate temp;
		temp = md[0];
		md[0] = md[1];
		md[1] = temp;
	}

	public static void main(String[] args) {
		MyDate dt[] = new MyDate[2];
		dt[0] = new MyDate(1, 1, 2001);
		dt[1] = new MyDate(2, 2, 2002);
		System.out.println("Before Swapping");
		System.out.println("dt[0]" + dt[0]);
		System.out.println("dt[1]" + dt[1]);

		swap(dt);

		System.out.println("After Swapping");
		System.out.println("dt[0]" + dt[0]);
		System.out.println("dt[1]" + dt[1]);

	}

}
