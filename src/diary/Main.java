package diary;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        signUp();
        signIn();
    }




    private static final Scanner collector = new Scanner(System.in);
    private static boolean isLock;
    private static final Diary diary = new Diary("Ernest", "1234");





    public static void signUp(){
        String space = " ";

        System.out.println("Create a username: ");
        String newUserName = collector.nextLine();

        if (newUserName.contains(space)){
            System.out.println("Invalid username");
        }
        else {
            diary.setDiaryName(newUserName);
        }

        System.out.println("Create a password");
        String newPassword = collector.nextLine();

        if (newPassword.contains(space)){
            System.out.println("Invalid password");
        }
        else{
            diary.setPassword(newPassword);
            System.out.println("Congratulations " + newUserName + " You are registered successfully");
        }
    }
    public static  void  signIn(){
        System.out.println("Enter your username to log in: ");
        String username = collector.nextLine();

        System.out.println("Enter your password to log in: ");
        String password = collector.nextLine();

        if (Objects.equals(username, diary.getDiaryName()) && Objects.equals(password, diary.getPassword())){
            System.out.println("Welcome " + username + ", You have been logged in successfully");
            runApp();
        }
        else {
            System.out.println("Invalid log in details, please try again");
            signIn();
        }
    }
    private static void signOut(){
        System.out.println("You have successfully logged out");
        System.out.println();
        System.out.println();
        signIn();
    }
    private static void changePassword(){
        String space = " ";

        System.out.println("Enter your current password: ");
        String currentPassword = collector.nextLine();

        System.out.println("Confirm your current password: ");
        String oldPassword = collector.nextLine();

        System.out.println("Enter your new password: ");
        String newPassword = collector.nextLine();

        System.out.println("Confirm your new password: ");
        String changedPassword = collector.nextLine();

        if (!Objects.equals(currentPassword, oldPassword) && currentPassword.contains(space) || oldPassword.contains(space) || newPassword.contains(space) || changedPassword.contains(space)){
            System.out.println("""
                    
                    Your current password is incorrect
                    
                    Please enter your old password to change password
                    
                    """);
        }
        else {
            diary.setPassword(changedPassword);
            System.out.println("Password changed successfully");
        }
    }
    private static void changeUserName(){
        String space = " ";

        System.out.println("Enter your current username: ");
        String currentUsername = collector.nextLine();

        System.out.println("Confirm your current username: ");
        String oldUsername = collector.nextLine();

        System.out.println("Enter your new username: ");
        String newUsername = collector.nextLine();

        System.out.println("Confirm your new username: ");
        String changedUsername = collector.nextLine();

        if (!Objects.equals(currentUsername, oldUsername) && currentUsername.contains(space) || oldUsername.contains(space) || newUsername.contains(space) || changedUsername.contains(space)){
            System.out.println("""
                    
                    Your current username is incorrect
                    
                    Please enter your old username to change username
                    
                    """);
        }
        else {
            diary.setDiaryName(changedUsername);
            System.out.println("Username changed successfully");
        }
    }
    private static void runApp() {
        try {
            for (int i = 0; i != -1; i++) {
                System.out.println("""
                                                
                                                
                        WELCOME TO YOUR DIARY
                        
                        FEEL FREE TO EXPRESS YOUR SELF
                                             
                        Press
                        1. --> To unlock and lock entry.
                        2. --> To create entry.
                        3. --> To find entry.
                        4. --> To delete entry.
                        5. --> To edit entry.
                        6. --> To show all entries
                        7. --> To change username.
                        8. --> To change password.
                        9. --> To sign out.
                        10. --> To exit the App.
                                                
                        """);

                int response = collector.nextInt();
                collector.nextLine();
                switch (response) {
                    case 1 -> lockAndUnlockEntry();
                    case 2 -> createEntry();
                    case 3 -> {
                        System.out.println("""
                                Enter
                                                                
                                1. To find by title
                                2. To find by ID
                                                                
                                """);
                        System.out.println(" ");
                        response = collector.nextInt();
                        collector.nextLine();
                        switch (response) {
                            case 1 -> findEntryByTitle();
                            case 2 -> findEntryById();
                        }
                    }
                    case 4 -> {
                        System.out.println("""
                                Enter
                                                                
                                1. To delete an entry by ID.
                                2. To delete an entry by title.
                                                                
                                """);
                        System.out.println(" ");
                        response = collector.nextInt();
                        collector.nextLine();
                        switch (response) {
                            case 1 -> deleteEntryById();
                            case 2 -> removeEntryByTitle();
                        }
                    }
                    case 5 -> {
                        System.out.println("""
                                Enter
                                                                
                                1. To edit an entry by title.
                                2. To edit an entry by ID.
                                                                
                                """);
                        System.out.println(" ");
                        response = collector.nextInt();
                        collector.nextLine();
                        switch (response) {
                            case 1 -> editEntryByTitle();
                            case 2 -> editById();
                        }
                    }
                    case 6 -> printAllEntry();
                    case 7 -> changeUserName();
                    case 8 -> changePassword();
                    case 9 -> signOut();
                    case 10 -> quit();
                    default -> {
                        System.out.println("Invalid Input");
                        runApp();
                    }
                }
            }
        } catch (InputMismatchException e) {
            throw new IllegalStateException("Unexpected entry");
        }
    }
    private static void lockAndUnlockEntry() {
        isLock = !isLock;
        if (isLock) {
            System.out.println("You have been locked out, press 1 to unlock");
        }
        else {
            System.out.println("Enter your password to unlock and use diary: ");
            String password = collector.nextLine();

            if (Objects.equals(password, diary.getPassword())) {
                System.out.println("Diary is now unlocked");
            } else {
                System.out.println("Wrong password, please try again");
                isLock = true;
                runApp();
            }
        }
    }
    private static void createEntry() {
        if (!isLock) {
            System.out.println("Enter the title of entry: ");
            String title = collector.nextLine();

            System.out.println("Enter the body of entry: ");
            String body = collector.nextLine();


            Entry entry = diary.createEntry(title, body);
            diary.addEntry(entry);

            System.out.println("Entry successfully added");
        } else
            System.out.println("Kindly unlock the diary");
    }
    private static void findEntryByTitle() {
        if (!isLock) {
            System.out.println("Enter the title: ");
            String title = collector.nextLine();

            System.out.println(diary.findEntryByTitle(title));
        } else
            System.out.println("Kindly unlock the diary");
    }
    private static void removeEntryByTitle() {
        if (!isLock) {
            System.out.println("Enter the title: ");
            String title = collector.nextLine();

            System.out.println("Enter password: ");
            String password = collector.nextLine();

            if (diary.removeEntry(title, password)) {
                System.out.println("Entry removed successfully");
            } else System.out.println("Entry not found");
        } else
            System.out.println("Kindly unlock the diary");
    }
    private static void findEntryById() {
        if (!isLock) {
            System.out.println("Enter the index number ID: ");
            int iD = collector.nextInt();

            System.out.println(diary.findEntryById(iD));
        } else
            System.out.println("Kindly unlock the diary");
    }
    private static void deleteEntryById() {
        if (!isLock) {
            System.out.println("Enter the index number ID: ");
            int iD = collector.nextInt();
            collector.nextLine();

            System.out.println("Enter password: ");
            String password = collector.nextLine();

            if (diary.removeById(iD, password)) {
                System.out.println("Entry removed successfully");
            } else System.out.println("Entry not found");
        } else System.out.println("Kindly unlock the diary");
    }
    private static void editEntryByTitle() {
        if (!isLock) {
            System.out.println("Enter title to edit: ");
            String entryTitle = collector.nextLine();

            System.out.println("Enter password: ");
            String password = collector.nextLine();

            System.out.println("Enter new title: ");
            String newTitle = collector.nextLine();

            System.out.println("Enter new body: ");
            String newBody = collector.nextLine();

            if (diary.editEntryByTitle(entryTitle, password, newTitle, newBody)) {
                System.out.println("Your entry has been edited successfully");
            } else System.out.println("Entry not found");
        } else System.out.println("kindly unlock the diary");
    }
    private static void editById() {
        if (!isLock) {
            System.out.println("Enter index number ID to edit: ");
            int iD = collector.nextInt();
            collector.nextLine();

            System.out.println("Enter password: ");
            String password = collector.nextLine();

            System.out.println("Enter a new title: ");
            String newTitle = collector.nextLine();

            System.out.println("Enter a new body: ");
            String newBody = collector.nextLine();

            if (diary.editEntryById(iD, password, newTitle, newBody)) {
                System.out.println("Your entry has been edited successfully");
            } else System.out.println("Entry not found");
        } else System.out.println("kindly unlock the diary");
    }
    private static void printAllEntry() {
        if (!isLock) {
            System.out.println("These are all entries in your diary: ");
            diary.viewAllEntry();
        } else System.out.println("kindly unlock the diary");
    }
    private static void quit() {
        System.out.println("Enjoy the rest of your day");
        System.exit(0);
    }
}
