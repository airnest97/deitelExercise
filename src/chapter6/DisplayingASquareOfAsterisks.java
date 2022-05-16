package chapter6;

import java.util.Scanner;

public class DisplayingASquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        int side = input.nextInt();
        squareOfAsterisks(side);
    }
    public static void squareOfAsterisks(int side){
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
