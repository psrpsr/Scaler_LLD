package LibraryManagementSystem;

public class NovelBook extends Book {
    String genre;
    NovelBook(String title, String author, String isbn, Boolean isAvailable,String genre){
        title = title;
        author = author;
        isbn = isbn;
        isAvailable = isAvailable;
        this.genre = genre;
    }
    @Override
    void displayBookDetails() {
        System.out.println("Novel Book Title: ");
    }
}
