package LibraryManagementSystem;

public class Member extends User {
    int borrowedBooksCount;
    int MAX_BORROW_LIMIT = 5;

    @Override
    public void displayDashboard() {
        System.out.println(this.getName()+" Dashboard Books Borrowed:"+this.borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        if (borrowedBooksCount < MAX_BORROW_LIMIT){
            return true;
        }
        return false;
    }

    public Member(){

    }
}
