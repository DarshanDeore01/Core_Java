package Day2_CW;

public class Student1 {
	public class Student 
	{
	  int sid;
	  String sname;
	  float sper;
	  
	 private void initStud()
	  {
	    sid=101;
	    sname="Amit";
	    sper=89.0f;
	  }
	  public void PrintStudent1()
	  { 
		 initStud(); //nesting of function
		 System.out.println("Student Id:"+sid);
		 System.out.println("Student Name:"+sname);
		 System.out.println("Student Percentage:"+sper);
	  }
	}

	public void PrintStudent1() {
		// TODO Auto-generated method stub
		
	}
}
