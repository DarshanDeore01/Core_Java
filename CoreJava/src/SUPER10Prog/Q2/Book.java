package SUPER10Prog.Q2;

public class Book
{
	    private int bookId;
	    private String bookName;
	    private String author;
	    private double price;
	
		public Book(int bookId, String bookName, String author, double price)
		{
			this.bookId = bookId;
			this.bookName = bookName;
			this.author = author;
			this.price = price;
		}

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
	
		public void displayBookDetails() 
		{
	        System.out.println("Book ID: " + bookId);
	        System.out.println("Book Name: " + bookName);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	        System.out.println();
	    }

}
