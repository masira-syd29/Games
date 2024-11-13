class Library{
    String[] books;
    int no_of_books;
    public Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are");
        for(String book : this.books){
            if(book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");

    }
    void returnBook(String book){
        //this.books[no_of_books] = book;
        addBook(book);

    }
}

public class CWM_OnlineLibrary {
    public static void main(String[] args) {
        //you have to implement a Library using Java class "Library"
        //Methods: addBook, issueBook, returnBook, showAvailableBooks
        //Properties: Array to store the available books
        //Array to store the issued books
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow rich");
        centralLibrary.addBook("Computer Applications");
        centralLibrary.addBook("Data structures and algorithms");
        centralLibrary.addBook("Fault in our stars");
        centralLibrary.addBook("It starts with us");
        centralLibrary.addBook("How i met your mother");
        centralLibrary.addBook("To all the boys i've loved before");



        centralLibrary.issueBook("It starts with us");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("It starts with us");
        centralLibrary.showAvailableBooks();
    }
}
