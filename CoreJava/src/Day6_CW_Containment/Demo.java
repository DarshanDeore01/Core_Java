package Day6_CW_Containment;

public class Demo {
	int x;
	int y;

	public Demo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int Max() {
		if (x > y) {
			return x;
		}

		return y;
	}

	public void displayMax() {
		System.out.println("Maximum of Two Numbers: " + Max());
	}

	@Override
	public String toString() {
		return " x:" + x + " y:" + y;
	}

	public static void main(String[] args) {
		Demo d1 = new Demo(10, 20);
		System.out.println(d1);
		d1.displayMax();
	}// end main
}// end class
