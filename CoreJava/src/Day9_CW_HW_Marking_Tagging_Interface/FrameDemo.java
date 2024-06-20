package Day9_CW_HW_Marking_Tagging_Interface;
import java.awt.Frame;
import java.util.Date;


public class FrameDemo 
{
    public static void main(String[] args) 
    {
		
		  Frame f = new Frame();
		  f.setSize(400,400);
		  f.setVisible(true);
		 
		  java.util.Date d = new Date();
		  System.out.println(d);
	}
}
