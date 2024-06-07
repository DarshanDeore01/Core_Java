package Day2_HW;

public class Customer 
{
	    int id;
	    long number;
	    String name, email;
	   
	    public void setId(int id1 )
	    {
	        id = id1;
	    }
	    public void setNumber(long number1 )
	    {
	        number = number1;
	    }
	    public void setname(String name1 )
	    {
	        name = name1;
	    }
	    public void setEmail(String Email1 )
	    {
	        email = Email1;
	    }
	   
	    public int getId()
	    {
	        return id;
	    }
	    public String getname()
	    {
	        return name;
	    }
	    public String getEmail()
	    {
	        return email;
	    }
	    public long getNumber()
	    {
	        return number;
	    }
	    public void printDetails()
	    {
	        System.out.println("Customer id is :"+id+"\nCustomer Name is:"+name+"\nCustomer Number is:"+number+"\nCustomer Email is:"+email);
	    }
}
