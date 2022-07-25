package phonebook;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        runApp();
    }

    public static void runApp(){
        for (int i = 0; i != -1; i++) {
            System.out.println("""
                Press
                1. To add to phonebook
                2. To view all contacts
                3. To exit
                """);
            int response = scanner.nextInt();
            scanner.nextLine();
            switch (response) {
                case 1 -> addContact();
                case 2 -> viewAll();
                case 3 -> exit();
            }
        }
    }

    private static void exit() {
        System.exit(200);
    }

    private static void viewAll() {
        phoneBook.viewAllEntry();
    }

    private static void addContact() {
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Address: ");
        String address = scanner.nextLine();

        System.out.println("email: ");
        String email = scanner.nextLine();

        Contacts contacts = phoneBook.createContact(name, phoneNumber, address, email);
        phoneBook.addContact(contacts);

        System.out.println("Contact added successfully");
    }

}
