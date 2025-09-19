class Book {
    private static String libraryName = "Central Library";

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn; // final variable initialization
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.isbn);
        } else {
            System.out.println("The object is not an instance of Book.");
        }
    }

    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("The Alchemist", "Paulo Coelho", "ISBN12345");
        book1.displayBookDetails(book1);

        Object notABook = new String("Not a book");
        book1.displayBookDetails(notABook);
    }
}
