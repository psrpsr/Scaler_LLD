package LibraryManagementSystem;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    abstract void displayBookDetails();

    Book(){
        isAvailable = true;
    }
    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(Book book){
        isbn = book.isbn;
        title = book.title;
        author = book.author;
        isAvailable = book.isAvailable;
    }
}
