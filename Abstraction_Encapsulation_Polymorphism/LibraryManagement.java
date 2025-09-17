import java.util.*;

// Interface for reservable items
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem implements Reservable {
    protected String itemId;
    protected String title;
    protected String author;

    // Encapsulation: borrower's details are private
    private String borrower;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null; // initially available
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (borrower == null ? "Available" : "Reserved by " + borrower));
    }

    // Encapsulation: restricted access to borrower info
    protected String getBorrower() {
        return borrower;
    }

    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration();
}

// Subclass Book
class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book already reserved by " + getBorrower());
        }
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower() == null;
    }
}

// Subclass Magazine
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine already reserved by " + getBorrower());
        }
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower() == null;
    }
}

// Subclass DVD
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD already reserved by " + getBorrower());
        }
    }

    @Override
    public boolean checkAvailability() {
        return getBorrower() == null;
    }
}

//demonstrate polymorphism
public class LibraryManagement {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("123", "the discovery", "Jay"));
        libraryItems.add(new Magazine("101", "Road Not Taken", "Robert Frost"));
        

        // Demonstrating polymorphism
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Reserve items
            item.reserveItem("Riya");
            item.getItemDetails();
        }
    }
}
