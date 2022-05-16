package chapter6;

import java.util.Scanner;

public class DisplayingASquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        int side = input.nextInt();

        System.out.println("Enter the character: ");
        char fill = input.next().charAt(0);

        squareOfFilledCharacter(side,fill);
    }
    public static void squareOfFilledCharacter(int side,char fillCharacter){
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print(fillCharacter+" ");
            }
            System.out.println();
        }
    }
}
