package LibraryManagementSystem;

import java.util.UUID;

public abstract class User {

    private String userId;
    private String name;
    private String contactInfo;
    static int totalUsers;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getcontactInfo(){
        return contactInfo;
    }
    public void setcontactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }
    public final String generateUniqueId(){
        totalUsers++;
        return "";
    }
    public static int getTotalUsers(){
        return totalUsers;
    }
    public User(){
        this.userId = generateUniqueId();
    }

    public User(String newName, String newContactInfo){
        userId = generateUniqueId();
        this.name = newName;
        this.contactInfo = newContactInfo;
    }

    public User(User otherUser){
        this.name = otherUser.name;
        this.contactInfo = otherUser.contactInfo;

    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

}

