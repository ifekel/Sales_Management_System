package sales;

import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Sales Management System");
        System.out.println("\nWhat would you like to do?");
        while (true) {
            System.out.println("\n1)Register\n2)Login\n");
            System.out.print(">>> ");
            String firstName;
            String lastName;
            String email;
            String password;
            int age;
            User user;
            Scanner input = new Scanner(System.in);
            try {
                int option = input.nextInt();
                if (option == 1) {
                    System.out.println("*****************REGISTER*****************");
                    // Getting the user's first name and storing it in a variable

                }
                else if (option == 2) {
                    System.out.println("*****************LOGIN*****************");
                }
                else {
                    System.out.println("ERROR!!!");
                }
            }
            catch (Exception e) {
                System.out.println("Enter a valid option");
            }
        }
    }
}