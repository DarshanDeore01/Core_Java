package Day2_HW;

public class Chair {
	   
    int id;
    String name,color;
    double price;
   
    public void setId(int id1 )
    {
        id = id1;
    }
    public void setname(String name1 )
    {
        name = name1;
    }
    public void setColor(String Color1 )
    {
        color = Color1;
    }
    public void setPrice(double price1 )
    {
        price = price1;
    }
    public int getId()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public double getPrice()
    {
        return price;
    }
    public void printDetails()
    {
        System.out.println("Chair id is :"+id+"\n Chair Name is:"+name+"\n Chair Color is:"+color+"\n Chair price is:"+price);
    }
}
   