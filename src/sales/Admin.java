package sales;

import java.util.ArrayList;

public class Admin {
    // Declared 5 fields for the user class
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private final int age; // Made the age final as when an object is instantiated, it's age cannot be changed.

    // An ArrayList that holds details of when a new object has been instantiated
    private final static ArrayList<Admin> admins = new ArrayList<>();

    // Method that will return to each field, and it will get stored in a variable
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getEmail() {
        return this.email;
    }
    public int getAge() {
        return this.age;
    }
    public String getPassword() {
        return this.password;
    }

    // Methods to change a field or property of a user object
    public String changeFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println("*********************First name changed successfully!*********************");
        return this.firstName;
    }

    public String changeLastName(String lastName) {
        this.lastName = lastName;
        System.out.println("*********************Last name changed successfully!*********************");
        return this.lastName;
    }

    public String changeAddress(String email) {
        this.email = email;
        System.out.println("*********************Address changed successfully!*********************");
        return this.email;
    }

    public String changePassword(String password) {
        this.password = password;
        System.out.println("*********************Password changed successfully!*********************");
        return this.password;
    }

    // A method that displays the details of a user instantiated object
    public void displayDetails() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Email Address: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("Age " + this.age);
    }

    // The constructor
    public Admin(String firstName, String lastName, String address, int age, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = address;
        this.age = age;
        this.password = password;
    }

    // Get the instantiated users from the User class
    public void displayAllRegisteredUsers() {
        User.showAllUsers();
    }

    // A method that will display every instantiated user object that has been stored in the ArrayList
    public void displayAllAdmins() {
        // Instantiating the Iterator object
        // To check if the adminObj has a next content
        for (Admin value : admins) {
            // If it has then it prints it out to the console.
            System.out.println(value);
        }
    }
}
