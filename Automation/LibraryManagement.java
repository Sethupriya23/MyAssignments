package Automation;

public class LibraryManagement {

	public static void main(String[] args) {
        // Creating an object of Library class
        Library library = new Library();

        // Adding a book
        String bookTitle = library.addBook("The Great Gatsby");

        // Issuing a book
        library.issueBook(bookTitle);
    }
}
