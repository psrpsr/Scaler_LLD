package LibraryManagementSystem;

public class TextBook extends Book{
    String subject;
    int edition;
    TextBook(String title, String author, String isbn, Boolean isAvailable, int edition, String subject) {
        super(isbn,title,author,isAvailable);
//        title = title;
//        author = author;
//        isbn = isbn;
//        isAvailable = isAvailable;

        this.edition = edition;
        this.subject = subject;

    }

    @Override
    public void displayBookDetails() {
        System.out.println("Book Title: ");
    }
}
