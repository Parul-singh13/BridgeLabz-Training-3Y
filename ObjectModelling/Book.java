import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library library1 = new Library("Central Library");
        Library library2 = new Library("Branch Library");

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book2); // Same book in different library
        library2.addBook(book3);

        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}
