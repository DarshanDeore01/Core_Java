package Day8_HW;

public class Test {

	public static void main(String[] args)
	{
		MobilePhone mp;
		
		mp = new SimplePhone();
		mp.MakeCall();
		
		mp= new SmartPhone();
		mp.MakeCall();
	}

}
