public class BookDetails{
    String title;
    String author;
    double price;
    BookDetails(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Title of the book: "+title);
		System.out.println("Author of the book: "+author);
		System.out.println("Price of the book: "+price);
	}
    public static void main(String[] args) {
        BookDetails book1= new BookDetails("Python","Raj",600);
        BookDetails book2= new BookDetails("2States","Chetan Bhagat",500);
        book1.displayDetails();
        book2.displayDetails();
    }

    }


 