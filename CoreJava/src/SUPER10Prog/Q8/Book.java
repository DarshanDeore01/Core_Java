package SUPER10Prog.Q8;

public class Book 
{
	
	    
	    private int isbnNo;           
	    private String bookName;      
	    private String author;        
	    
	    
	    public Book(int isbnNo, String bookName, String author)
	    {
	        this.isbnNo = isbnNo;     
	        this.bookName = bookName; 
	        this.author = author;     
	    }

	    
	    public int getIsbnNo() 
	    {
	        return isbnNo;
	    }

	    
	    public void setIsbnNo(int isbnNo)
	    {
	        this.isbnNo = isbnNo;
	    }

	   
	    public String getBookName()
	    {
	        return bookName;
	    }

	    
	    public void setBookName(String bookName) 
	    {
	        this.bookName = bookName;
	    }

	    
	    public String getAuthor()
	    {
	        return author;
	    }

	    
	    public void setAuthor(String author)
	    {
	        this.author = author;
	    }

	    
	    @Override
	    public String toString() {
	        return "ISBN: " + isbnNo + ", Title: " + bookName + ", Author: " + author;
	    }
	}


