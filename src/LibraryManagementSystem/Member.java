package LibraryManagementSystem;

public class Member extends User {
    private int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT = 5;

    public Member(){
        super();
        borrowedBooksCount = 0;
    }
    public Member(String name, String contactInfor){
        super(name, contactInfor);
        borrowedBooksCount = 0;

    }

    @Override
    public void displayDashboard() {
        System.out.printf("Member Dashboard\n");
        System.out.printf("Name: "+getName()+"\n");
        System.out.println("Number of Books Borrowed: "+borrowedBooksCount);
        //System.out.println(this.getName()+" Dashboard Books Borrowed:"+this.borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        if (borrowedBooksCount < MAX_BORROW_LIMIT){
            return true;
        }
        return false;
    }


}
