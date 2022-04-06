package chapter4;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number between 1 and 10: ");
        int number = input.nextInt();
        if (number >= 1 && number <= 10) {
            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= row; column++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else System.out.println("Wrong entry. Next time, entered a number between 1 and 10: ");
    }
}

