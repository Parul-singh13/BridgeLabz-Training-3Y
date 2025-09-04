class Book{
    String title ;
    String author;
    int price;
    //Default Constructor
    Book(){
        title="Wings of Fire";
        author="APJ Abdul Kalam";
        price=300;
    }
    //Parameterized Constructor
    Book(String title,String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displayBookDetail(){
        System.out.println("Book Name: " + title);
        System.out.println("Author :"+author);
        System.out.println("Price :" +price);

    }

    public static void main(String[] args) {
        //Default Constructor
        Book book1=new Book();
        book1.displayBookDetail();
        //Parameterized Constructor
        Book book2=new Book("Alice Wonderlan","Jane Austan",600);
        book2.displayBookDetail();

    }
}