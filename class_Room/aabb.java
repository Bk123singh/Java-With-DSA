class Book {
    String id;
    String title;
    String author;
    String category;
    boolean isBorrowed;

    public Book(String id, String title, String author, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return "Book{ID=" + id + ", Title='" + title + "', Author='" + author + "', Category='" + category + "', Is Borrowed=" + isBorrowed + '}';
    }
}

// User class representing a user in the library system
class User {
    String username;
    String password;
    List<Book> borrowedBooks;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.borrowedBooks = new ArrayList<>();
    }
}

// Library class to manage the books and users
class Library {
    // HashMap to store books based on their ID
    private Map<String, Book> books;
    // TreeMap to categorize books based on their genre
    private Map<String, List<Book>> categorizedBooks;
    // List to store registered users
    private List<User> users;
    // For user authentication
    private User loggedInUser;

    public Library() {
        books = new HashMap<>();
        categorizedBooks = new TreeMap<>();
        users = new ArrayList<>();
        loggedInUser = null;
    }

    // Add a new book to the library
    public void addBook(Book book) {
        books.put(book.id, book);
        categorizedBooks.computeIfAbsent(book.category, k -> new ArrayList<>()).add(book);
    }

    // Register a new user
    public void registerUser(String username, String password) {
        users.add(new User(username, password));
    }

    // User login function
    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                loggedInUser = user;
                System.out.println("Login successful!");
                return true;
            }
        }
        System.out.println("Invalid username or password.");
        return false;
    }

    // Search for a book by title or author
    public List<Book> searchBooks(String query) {
        List<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.title.toLowerCase().contains(query.toLowerCase()) || 
                book.author.toLowerCase().contains(query.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    // Borrow a book
    public boolean borrowBook(String bookId) {
        if (loggedInUser == null) {
            System.out.println("Please login first.");
            return false;
        }

        Book book = books.get(bookId);
        if (book != null && !book.isBorrowed) {
            loggedInUser.borrowedBooks.add(book);
            book.isBorrowed = true;
            System.out.println("You have borrowed: " + book);
            return true;
        } else {
            System.out.println("Book is either not available or already borrowed.");
            return false;
        }
    }

    // Return a borrowed book
    public boolean returnBook(String bookId) {
        if (loggedInUser == null) {
            System.out.println("Please login first.");
            return false;
        }

        for (Book book : loggedInUser.borrowedBooks) {
            if (book.id.equals(bookId)) {
                loggedInUser.borrowedBooks.remove(book);
                book.isBorrowed = false;
                System.out.println("You have returned: " + book);
                return true;
            }
        }

        System.out.println("You haven't borrowed this book.");
        return false;
    }

    // Display all books in a category
    public void displayBooksInCategory(String category) {
        List<Book> categoryBooks = categorizedBooks.get(category);
        if (categoryBooks != null) {
            for (Book book : categoryBooks) {
                System.out.println(book);
            }
        } else {
            System.out.println("No books found in this category.");
        }
    }

    // Display all books
    public void displayAllBooks() {
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    // Display borrowed books of the logged-in user
    public void displayBorrowedBooks() {
        if (loggedInUser != null) {
            if (loggedInUser.borrowedBooks.isEmpty()) {
                System.out.println("No books borrowed.");
            } else {
                for (Book book : loggedInUser.borrowedBooks) {
                    System.out.println(book);
                }
            }
        } else {
            System.out.println("Please login first.");
        }
    }
}

public class aabb{
    public static void main(String[] args) {
        Library library = new Library();

        // Register users
        library.registerUser("john", "password123");
        library.registerUser("alice", "password456");

        // Login user
        library.login("john", "password123");

        // Add books to the library
        Book book1 = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        Book book2 = new Book("2", "To Kill a Mockingbird", "Harper Lee", "Fiction");
        Book book3 = new Book("3", "A Brief History of Time", "Stephen Hawking", "Non-fiction");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Search for a book
        System.out.println("Search results for 'Gatsby':");
        List<Book> searchResults = library.searchBooks("Gatsby");
        for (Book book : searchResults) {
            System.out.println(book);
        }

        // Borrow a book
        library.borrowBook("1");

        // Display borrowed books
        library.displayBorrowedBooks();

        // Return a book
        library.returnBook("1");

        // Display all books
        library.displayAllBooks();

        // Display books in a specific category
        System.out.println("\nBooks in 'Fiction' category:");
        library.displayBooksInCategory("Fiction");
    }
}