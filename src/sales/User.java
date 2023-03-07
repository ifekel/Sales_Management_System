package sales;
import java.util.ArrayList;

public class User {
    // Declared 5 fields for the user class
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private final int age; // Made the age final as when an object is instantiated, it's age cannot be changed.

    // An ArrayList that holds details of when a new object has been instantiated
    private final static ArrayList<User> users = new ArrayList<>();

    // Method that will return each field and it will get stored in a variable
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
    public String getPassword() { return this.password; }


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
        System.out.println("*********************Address changed successfully!*********************");
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
    public User(String firstName, String lastName, String email, int age, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.password = password;
        User.users.add(this);
    }

    // A method that will display every instantiated user object that has been stored in the ArrayList
    public static void showAllUsers() {
        // Instantiating the Iterator object
        // To check if the userObj has a next content
        for (User value : users) {
            // If it has then it prints it out to the console.
            System.out.println(value);
        }
    }
}
