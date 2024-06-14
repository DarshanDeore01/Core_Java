package SUPER10Prog.Q7;

public class Product 
{
		    
	    private String productCode;
	    private String name; 
	    
	   
	    private static int nextProductNumber = 101;

	    
	    public Product(String name) 
	    {
	        this.name = name; 
	        this.productCode = generateProductCode(); 
	    }

	   
	    public String getProductCode() 
	    {
	        return productCode;
	    }

	    
	    public void setName(String name)
	    {
	        this.name = name;
	    }

	   
	    public String getName() {
	        return name;
	    }

	    private String generateProductCode() 
	    {
	        String code = "P" + nextProductNumber;
	        nextProductNumber++; 
	        return code;
	    }

	    
	    @Override
	    public String toString() {
	        return "Product Code: " + productCode + ", Name: " + name;
	    }

	   
	    public static void main(String[] args) {
	       
	        Product p1 = new Product("watch");
	        Product p2 = new Product("Laptop");
	        Product p3 = new Product("TV");
	        Product p4 = new Product("Mobile");
	        Product p5 = new Product("TAB");
	        Product p6 = new Product("TELEPHONE");

	        
	        System.out.println("Product 1 Details:");
	        System.out.println(p1.toString());
	        System.out.println();

	        System.out.println("Product 2 Details:");
	        System.out.println(p2.toString());
	        System.out.println();
	        
	        System.out.println("Product 3 Details:");
	        System.out.println(p3.toString());
	        System.out.println();
	        
	        System.out.println("Product 4 Details:");
	        System.out.println(p4.toString());
	        System.out.println();
	        
	        System.out.println("Product 5 Details:");
	        System.out.println(p5.toString());
	        System.out.println();
	        
	        System.out.println("Product 6 Details:");
	        System.out.println(p6.toString());
	        System.out.println();
	    }
	}


