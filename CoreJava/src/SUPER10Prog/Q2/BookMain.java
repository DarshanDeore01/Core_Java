package SUPER10Prog.Q2;
import java.util.*;
public class BookMain 
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the library size: ");
        int size = sc.nextInt(); 
        Library li = new Library(size);
        int ch=0;
    
    while (true) 
	{ 
        System.out.println("\nMenu:");
        System.out.println("1. Add Book");
        System.out.println("2. Update Book by ID");
        System.out.println("3. Display All Books");
        System.out.println("4. Display Books by Author");
        System.out.println("5. Display Book by ID");
        System.out.println("6. Exit");
        System.out.print("Enter Your Choice: ");
        int option = sc.nextInt(); 
        switch (option)
        {
        case 1: 
            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Book Name: ");
            String bookName = sc.nextLine(); 
            System.out.print("Enter Author: ");
            String author = sc.nextLine(); 
            System.out.print("Enter Price: ");
            double price = sc.nextDouble(); 
            Book book = new Book(bookId, bookName, author, price); 
            li.addBook(book); 
            break;
        case 2: 
            System.out.print("Enter Book ID to update: ");
            int updateId = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter new Book Name: ");
            String newBookName = sc.nextLine(); 
            System.out.print("Enter new Author: ");
            String newAuthor = sc.nextLine(); 
            System.out.print("Enter new Price: ");
            double newPrice = sc.nextDouble();
            li.updateBookById(updateId, newBookName, newAuthor, newPrice); 
            break;
        case 3: 
            li.displayAllBooks(); 
            break;
        case 4: 
            System.out.print("Enter Author: ");
            sc.nextLine(); 
            String searchAuthor = sc.nextLine(); 
            li.displayBooksByAuthor(searchAuthor); 
        case 5:
            System.out.print("Enter Book ID: ");
            int searchId = sc.nextInt();
            li.displayBookById(searchId); 
            break;
        case 6: 
            System.out.println("Exiting...");
            sc.close(); 
            return;
        default:
            System.out.println("Invalid option.");
        }
            
		
	}
	
  }
}

