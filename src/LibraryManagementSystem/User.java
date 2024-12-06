package LibraryManagementSystem;

import java.util.UUID;

public abstract class User {
    /*

    Task 1: Create the Base User Class
Objective: Introduce abstract classes, encapsulation, and basic object-oriented principles.
Step 1.1: Define a class User with the following private attributes:
String userId
String name
String contactInfo
Step 1.2: Add getter and setter methods for name and contactInfo.
Challenge: Use encapsulation by keeping attributes private and accessing them through getters/setters.

     */
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

