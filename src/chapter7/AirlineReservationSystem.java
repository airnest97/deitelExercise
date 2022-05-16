package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservationSystem {
    private final static boolean[] airlineSeat = new boolean[10];
    static int countA = 0;
    static int countB = 5;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            selectFlight();
            System.out.println();
        }
        printSeatReservationStatus();
    }

    public static void fillFirstClass() {
        if (countA < 5) {
            airlineSeat[countA] = true;
            System.out.printf("""
                    Here is your boarding pass details:
                    --> Your ticket number is 0%02d
                    --> It is in the first class section of the plane""",(countA+1));
            System.out.println();
            countA++;
        }
        else {
            System.out.println("oops! First class section is fully booked");
            System.out.println("Would you like reserving a seat in economy class?");
            System.out.println("(Type Yes or No)");
            input.nextLine();
            String option = input.nextLine();
            if (option.toUpperCase().equals("YES")){fillEconomy();}
            else if (option.toUpperCase().equals("NO")){
                System.out.println("Next flight leaves in 3 hours.");}
        }

    }

    public static void selectFlight() {
        System.out.println("""
                Type: 1 or 2
                1. For first class
                2. For economy""");
        int option = input.nextInt();
        if (option == 1) {
            fillFirstClass();
        }
        else if (option == 2) {
            fillEconomy();
        }
        else selectFlight();

    }

    private static void fillEconomy() {
        if (countB >= 5 && countB < 10) {
            airlineSeat[countB] = true;
            System.out.printf("""
                    Here is your boarding pass details:
                    --> Your ticket number is 0%02d
                    --> It is in the economy section of the plane""",(countB+1));
            System.out.println();
            countB++;

        }
        else {
            System.out.println("oops! Economy section is fully booked");
            System.out.println("Would you like reserving a seat in first class?");
            System.out.println("(Type Yes or No)");
            input.nextLine();
            String option = input.nextLine();
            if (option.toUpperCase().equals("YES")){fillFirstClass();}
            else if (option.toUpperCase().equals("NO")){
                System.out.println("Next flight leaves in 3 hours.");}
        }

    }
    public static void printSeatReservationStatus(){
        System.out.print("Seat reservation status: ");
        System.out.println(Arrays.toString(airlineSeat));
    }
}