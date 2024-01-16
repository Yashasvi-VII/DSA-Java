public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String title, String author, String isbn) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    Book(String isbn) {
        this("unknown", "unknown", isbn);
    }

    static int getTotalNoOfBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed " + this.title);
        } else {
            System.out.println("this Book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book ikagai = new Book("ikagai", "hector gracia", "1111");
        System.out.println(Book.getTotalNoOfBooks());
        ikagai.borrowBook();
        System.out.println(Book.getTotalNoOfBooks());
        ikagai.returnBook();
        ikagai.returnBook();
    }
}

