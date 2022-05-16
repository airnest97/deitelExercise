package chapter6;

import java.util.Scanner;

public class TestForLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int Year = input.nextInt();
        isLeapYear(Year);
    }

    public static void isLeapYear(int Year) {
        if (Year >= 1000 && Year <= 10000) {
            if (Year % 4 == 0) {
                System.out.println(Year + " is a leap year");
            }
            else System.out.println(Year + " is not a leap year");
        }
        else System.out.println("Kindly enter a valid year");
    }
}
