package SUPER10Prog.Q2;

public class Library 
{
	private Book[] books;
    private int bookCount;

    public  Library(int size) 
    {
        books = new Book[size];
        bookCount = 0;
    }
    public void addBook(Book book)
    {
        if (bookCount < books.length) 
        { 
            books[bookCount] = book; 
            bookCount++; 
        } 
        else
        {
            System.out.println("Library is full.");
        }
    }
    public void updateBookById(int bookId, String bookName, String author, double price)
    {
        for (int i = 0; i < bookCount; i++) 
        {
            if (books[i].getBookId() == bookId)
            { 
                books[i].setBookName(bookName); 
                books[i].setAuthor(author); 
                books[i].setPrice(price);
                System.out.println("Book information updated."); 
                
            }
          
            {
            	System.out.println("Book ID not found.");
			}
        }
        return;   
    }
    
    public void displayAllBooks() 
    {
        for (int i = 0; i < bookCount; i++) 
        {
            books[i].displayBookDetails(); 
        }
    }
    public void displayBooksByAuthor(String author) 
    { 
    	boolean found = false; 
        for (int i = 0; i < bookCount; i++) 
        { 
            if (books[i].getAuthor().equalsIgnoreCase(author))
            { 
                books[i].displayBookDetails(); 
                found = true; 
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author); // Notify user if no books were found
        }
        }
        
    
    public void displayBookById(int bookId)
    {
        for (int i = 0; i < bookCount; i++) 
        { 
            if (books[i].getBookId() == bookId) 
            { 
                books[i].displayBookDetails(); 
                return; 
            }
                        {
            	 System.out.println("Book ID not found."); 
            }
        }
       
    }
}
