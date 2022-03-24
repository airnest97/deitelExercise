package task;

import java.util.Scanner;

public class NokiaPhone {
    public static void main(String[] args) {
        Scanner keypad = new Scanner(System.in);

        System.out.println("""
                Enter
                
                1 for Phonebook
                2 for Messages
                3 for Chat
                4 for Chat Register
                5 for Tones
                6 for Settings
                7 for Call divert
                8 for Games
                9 for Calculator
                10 for Reminder
                11 for Clock
                12 for Profile
                13 for SIM services
                """);
        System.out.println(" ");
        int selectedOption = keypad.nextInt();
        switch (selectedOption) {
            case 1 -> {
                System.out.println("""
                        Enter
                                                
                        1 for Search
                        2 for Service Nos.
                        3 for Add name
                        4 for Erase
                        5 for Edit
                        6 for Assign Tone
                        7 for Send b' card
                        8 for Options
                        9 for Speed dials
                        10 for Voice tags
                        """);
                System.out.println(" ");
                selectedOption = keypad.nextInt();
                switch (selectedOption) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign Tone");
                    case 7 -> System.out.println("Send b' card");
                    case 8 -> {
                        System.out.println("""
                                Enter
                                                               
                                1 for Type of view
                                2 for Memory status
                                """);
                        System.out.println(" ");
                        selectedOption = keypad.nextInt();
                        switch (selectedOption) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                        }
                    }
                    case 9 -> System.out.println("Speed dial");
                    case 10 -> System.out.println("Voice tags");
                }
            }
            case 2 -> {
                System.out.println("""
                        Enter
                                                
                        1 for Write messages
                        2 for Inbox
                        3 for Outbox
                        4 for Picture messages
                        5 for Templates
                        6 for Smiley
                        7 for Message settings
                        8 for info services
                        9 for Voice mailbox number
                        10 for Service command editor
                        """);
                System.out.println(" ");
                selectedOption = keypad.nextInt();
                switch (selectedOption) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smiley");
                    case 7 -> {
                        System.out.println("""
                                Enter
                                                                
                                1 for Set
                                2 for Common
                                """);
                        System.out.println(" ");
                        selectedOption = keypad.nextInt();
                        switch (selectedOption) {
                            case 1 -> {
                                System.out.println("""
                                        Enter
                                                                                
                                        1. Message centre number
                                        2. Message sent as
                                        3. Message validity
                                        """);
                                System.out.println(" ");
                                selectedOption = keypad.nextInt();
                                switch (selectedOption) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("Message validity");
                                }
                            }
                            case 2 -> {
                                System.out.println("""
                                        Enter
                                                                                
                                        1 for Delivery reports
                                        2 for Reply via same centre
                                        3 for Character support
                                        """);
                                System.out.println(" ");
                                selectedOption = keypad.nextInt();
                                switch (selectedOption) {
                                    case 1 -> System.out.println("Delivery report");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("Info services");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                }
            }
            case 3 -> System.out.println("Chat");
            case 4 -> {
                System.out.println("""
                        Enter
                                                
                        1 for Missed calls
                        2 for Received calls
                        3 for Dialled numbers
                        4 for Erase recent call lists
                        5 for Show call duration
                        6 for Show call costs
                        7 for Call cost settings
                        8 for Prepaid credit
                        """);
                System.out.println(" ");
                selectedOption = keypad.nextInt();
                switch (selectedOption) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("""
                                Enter
                                                                
                                1 for Last call duration
                                2 for All calls' duration
                                3 for Received calls' duration
                                4 for Dialled calls' duration
                                5 for Clear timers
                                """);
                        System.out.println(" ");
                        selectedOption = keypad.nextInt();
                        switch (selectedOption) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls' duration");
                            case 3 -> System.out.println("Received calls' duration");
                            case 4 -> System.out.println("Dialled calls' duration");
                            case 5 -> System.out.println("Clear timers");
                        }
                    }
                    case 6 -> {
                        System.out.println("""
                                Enter
                                                                
                                1 for Last call cost
                                2 for All calls' cost
                                3 for Clear counters
                                """);
                        System.out.println(" ");
                        selectedOption = keypad.nextInt();
                        switch (selectedOption) {
                            case 1 -> System.out.println("Last call cost");
                            case 2 -> System.out.println("All calls' cost");
                            case 3 -> System.out.println("Clear counters");
                        }
                    }
                    case 7 -> {
                        System.out.println("""
                                Enter
                                                                
                                1 for Call cost limiter
                                2 for Show costs in
                                """);
                        System.out.println(" ");
                        selectedOption = keypad.nextInt();
                        switch (selectedOption) {
                            case 1 -> System.out.println("Call cost limiter");
                            case 2 -> System.out.println("Show costs in");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit");
                }
            }
            case 5 -> {
                System.out.println("""
                        Enter
                                                
                        1 for Ringing tone
                        2 for Ringing volume
                        3 for Incoming call alert
                        4 for Composer
                        5 for Message alert tone
                        6 for Keypad tones
                        7 for Warning and game tones
                        8 for Vibrating alert
                        9 for Screen saver
                        """);
                System.out.println(" ");
                selectedOption = keypad.nextInt();
                switch (selectedOption) {
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                }
            }
            case 6 -> {
                System.out.println("""
                        Enter
                                                
                        1 for Call settings
                        2 for Phone settings
                        3 for Security settings
                        4 for Restore factory setting
                        """);
                selectedOption = keypad.nextInt();
                switch (selectedOption) {
                    case 1 -> {
                        System.out.println("""
                                Enter
                                                                
                                1 for Automatic redial
                                2 for Speed dialling
                                3 for Call waiting options
                                4 for Own number sending
                                5 for Phone line in use
                                6 for Automatic answer
                                """);
                        System.out.println(" ");
                        selectedOption = keypad.nextInt();
                        switch (selectedOption) {
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dial");
                            case 3 -> System.out.println("Call waiting options");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer");
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                Enter
                                                                
                                1 for Language
                                2 for Cell info display
                                3 for Welcome note
                                4 for Network selection
                                5 for Lights
                                6 for Confirm SIM service actions
                                """);
                        System.out.println(" ");
                        selectedOption = keypad.nextInt();
                        switch (selectedOption) {
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Cell info display");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Lights");
                            case 6 -> System.out.println("Confirm SIM service actions");
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                Enter
                                                                
                                1 for PIN code request
                                2 for Call barring service
                                3 for Fixed dialling
                                4 for Closed user group
                                5 for Phone security
                                6 for Change access code
                                """);
                        System.out.println(" ");
                        selectedOption = keypad.nextInt();
                        switch (selectedOption) {
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring services");
                            case 3 -> System.out.println("Fixed dialling");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Phone security");
                            case 6 -> System.out.println("Change access code");
                        }
                    }
                    case 4 -> System.out.println("Restore factory setting");
                }
            }
            case 7 -> System.out.println("Call divert");
            case 8 -> System.out.println("Games");
            case 9 -> System.out.println("Calculator");
            case 10 -> System.out.println("Reminder");
            case 11 -> {
                System.out.println("""
                        Enter
                                                
                        1 for Alarm clock
                        2 for Clock settings
                        3 for Date setting
                        4 for Stopwatch
                        5 for Countdown timer
                        6 for Auto update of date and time
                        """);
                System.out.println(" ");
                selectedOption = keypad.nextInt();
                switch (selectedOption) {
                    case 1 -> System.out.println("Alarm clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Date setting");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                }
            }
            case 12 -> System.out.println("Profile");
            case 13 -> System.out.println("SIM services");
            default -> System.out.println("MUMU, Try to read and follow instructions you bloody fool");
        }
    }
}