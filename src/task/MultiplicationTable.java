package task;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner multiplicationTable = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = multiplicationTable.nextInt();

        for (int i = 1; i <= 12; i++) {
            int multiplication = number * i;
            System.out.println(number +" X " + i +" = " +multiplication + "   ");
        }
        System.out.println();

        for (int i = 1; i <= 12; i++) {
            for (int a = 1; a <= 12; a++) {
                int multiplication = a * i;
                System.out.printf("%2d X %2d = %3d  ", a, i, multiplication);
            }
            System.out.println();
        }
    }
}
