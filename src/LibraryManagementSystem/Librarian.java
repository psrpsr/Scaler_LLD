package LibraryManagementSystem;

import java.awt.print.Book;

public class Librarian extends User{
    private String employeeNumber;

    public Librarian(String employeeNumber, String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard ");
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Name : "+getName());
    }

    @Override
    public boolean canBorrowBooks() {
        return true; // Because librarians can borrow any number of books
    }

    void addNewBook(Book book) {

    }
    void removeBook(Book book) {

    }
}
