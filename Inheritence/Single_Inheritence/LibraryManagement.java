public class LibraryManagement {

    // Superclass Book
    static class Book {
        private String title;
        private int publicationYear;

        public Book(String title, int publicationYear) {
            this.title = title;
            this.publicationYear = publicationYear;
        }

        public void displayInfo() {
            System.out.println("Book Title: " + title);
            System.out.println("Publication Year: " + publicationYear);
        }
    }

    // Subclass Author extends Book
    static class Author extends Book {
        private String name;
        private String info;

        public Author(String title, int publicationYear, String name, String info) {
            super(title, publicationYear);
            this.name = name;
            this.info = info;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Author Name: " + name);
            System.out.println("Author Bio: " + info);
        }
    }

    public static void main(String[] args) {
        Author authorBook = new Author("Effective Java", 2018, "Joshua Bloch", "He is a software engineer and author.");
        authorBook.displayInfo();
    }
}
