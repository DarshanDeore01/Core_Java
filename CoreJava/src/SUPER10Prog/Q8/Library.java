package SUPER10Prog.Q8;
import java.util.*;
public class Library 
{
	private Book[] books;  
    private int bookCount;  
    
    
    public Library() 
    {
        this.books = new Book[10]; 
        this.bookCount = 0;         
    }
    
    
    public void addBook(Book book) 
    {
        if (bookCount < 10)
        {   
            books[bookCount] = book;   
            bookCount++; 
            System.out.println("Book added successfully.");
        } else 
        {
            System.out.println("Library is full");
        }
    }
    
    
    public void searchBook(String name) 
    {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) 
        {
            if (books[i].getBookName().equalsIgnoreCase(name)) 
            {  
                System.out.println("Book found:");
                System.out.println(books[i]); 
                found = true;
                break;  
            }
        }
        if (!found)
        {
            System.out.println("Book not found in the library.");
        }
    }
    
   
    public void displayAllBooks() 
    {
        if (bookCount == 0) 
        {
            System.out.println("No books available in the library.");
        } else
        {
            System.out.println("List of books:");
            for (int i = 0; i < bookCount; i++) 
            {
                System.out.println(books[i]);   
            }
        }
    }
    
   
    public static void main(String[] args) {
        Library li = new Library(); 
        
        
        li.addBook(new Book(101, "The White Tiger", "Aravind Adiga"));
        li.addBook(new Book(102, "Train to Pakistan", "Khushwant Singh"));
        li.addBook(new Book(103, "The God of Small Things", "Arundhati Roy"));
        li.addBook(new Book(104, "Midnight's Children", "Salman Rushdie"));
        li.addBook(new Book(105, "A Suitable Boy", "Vikram Seth"));
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the name of the book to search: ");
        String bookName = sc.nextLine();
        
 
        li.searchBook(bookName);
        
        
        System.out.println("\nDetails of all books in the library:");
        li.displayAllBooks();
        
        sc.close();
    }
}
