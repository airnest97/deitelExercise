package chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int minimum;
        int maximum = 0;
        System.out.println("Enter first number");
        int number = input.nextInt();
        minimum = number;
        while (counter <= 9) {
            System.out.println("Enter other number: ");
            number = input.nextInt();
            if (number < minimum) {
                minimum = number;
         }
            if (number > maximum) {
                maximum = number;
            }counter++;
        }
        System.out.printf("The sum of the maximum and second largest number is %d and %d", maximum, minimum);
    }
}