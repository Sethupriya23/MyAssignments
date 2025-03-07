package Automation;

public class Library {
    // Method to add a book
	
    public String addBook(String bookTitle) {
        System.out.println("Book added successfully: " + bookTitle);
        return bookTitle;
    }

    // Method to issue a book
    public void issueBook(String bookTitle) {
        System.out.println("Book issued successfully: " + bookTitle);
    }
}