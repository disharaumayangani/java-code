// Class definition for Book
class Book {
    // Fields (Attributes)
    String title;
    String author;
    boolean isAvailable;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, the book is available
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("The book \"" + title + "\" is not available.");
        }
    }

    // Method to return the book
    public void returnBook() {
        isAvailable = true;
        System.out.println("The book \"" + title + "\" has been returned.");
    }
}

// Class definition for Library
class Library {
    // Fields
    String name;
    Book[] books;

    // Constructor
    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + name + " - Book List:");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

// Main class
public class LibrarySystemExample {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Create an array of books
        Book[] libraryBooks = {book1, book2, book3};

        // Create a Library object
        Library library = new Library("City Library", libraryBooks);

        // Display all books in the library
        library.displayBooks();

        // Borrow and return books
        book1.borrowBook();
        book1.borrowBook(); // Attempt to borrow again
        book1.returnBook();
        book1.borrowBook();

        // Display books again to see updated availability
        library.displayBooks();
    }
}
