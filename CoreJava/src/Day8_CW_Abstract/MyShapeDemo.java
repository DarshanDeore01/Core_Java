package Day8_CW_Abstract;

public class MyShapeDemo {

	public static void main(String[] args) 
	{
		MyShape ms;
		
		ms=new Circle(6.23f);
		ms.area();
		
		ms=new Rectangle(10,20);
		ms.area();
	}

}
