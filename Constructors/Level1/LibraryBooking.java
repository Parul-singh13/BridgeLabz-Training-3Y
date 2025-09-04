class Book {
    String title;
    String author;
    double price;
    boolean availability;

    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrow() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }
    public static void main(String[] args) {
        Book book1=new Book("MathsBook","Rd Sharma",500,true);
        book1.borrow();
    }

}
