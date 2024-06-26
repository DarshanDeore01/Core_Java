package Lab_Manual.Lab_Exercise_20;

import java.io.File;

public class FileDemo 
{
	public static void main(String[] args)
	{
	    File f = new File("C:\\Users\\DARSHAN\\git\\Core_Java\\CoreJava\\src\\Lab_Manual\\Lab_Exercise_20\\f.txt");
	    
	    if (f.exists())
	    {
	    	System.out.println("File f.txt Already Exist...!");
	    	System.out.println("File Name: "+f.getName());
	    	System.out.println("Path: "+f.getAbsolutePath());
	    	System.out.println("Writable: "+f.canWrite());
	    	System.out.println("Readable: "+f.canRead());
	    	System.out.println("File Size In Bytes: "+f.length());
	    }
	    else
	    {
	    	System.out.println("File f.txt Does Not Exist...!");
	    }
	}

}
