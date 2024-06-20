package Day9_CW_HW_Marking_Tagging_Interface;

 class SPCollege
{
	//Members
}
 class FCCollege implements GradeA
 {
	 // Members
 }


public class MarkerDemoMainApp 
{

	public static void main(String[] args)
	{
		SPCollege obj1 = new SPCollege();
		FCCollege obj2 = new FCCollege();
		
		if (obj1 instanceof GradeA)
		{
			System.out.println("SP College is Garde A college");
		}
		if (obj2 instanceof GradeA)
		{
			System.out.println("FC College is Garde A college");
		}
	}

}
