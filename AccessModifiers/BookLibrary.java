class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Set author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Get author
    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    // Constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to demonstrate access modifiers
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN); // public, accessible
        System.out.println("Title: " + title); // protected, accessible in subclass
        System.out.println("Author: " + getAuthor()); // private, accessed via public method
    }

    // Main method to generate output
    public static void main(String[] args) {
        EBook ebook = new EBook("123456789", "Java Programming", "John Doe");
        ebook.displayDetails();
        System.out.println();
        ebook.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
