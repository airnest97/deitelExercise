package task;

import java.util.Scanner;

public class DivisionUsingLoop {
    public static void main(String[] args) {
        int numerator;
        int denominator;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        numerator = input.nextInt();

        System.out.println("Enter denominator: ");
        denominator = input.nextInt();

        for (int i = 0; numerator >= denominator; i++) {
                ++count;
            numerator = numerator - denominator;
        }
        System.out.println();
        System.out.println(count + " remainder " + numerator);
    }
}
