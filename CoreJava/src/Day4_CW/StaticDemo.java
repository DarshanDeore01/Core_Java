package Day4_CW;

public class StaticDemo {
	int x;

	public StaticDemo() {
		x = 10;
	}

	public void display() {
		System.out.println("x:" + x);
	}

	public static void main(String[] args) {
		StaticDemo d1 = new StaticDemo();
		d1.display();
	}// end main
}
