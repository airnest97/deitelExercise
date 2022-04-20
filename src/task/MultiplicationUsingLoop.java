package task;

import java.util.Scanner;

public class MultiplicationUsingLoop {

    public static void main(String[] args) {

        int product = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter multiplier: ");
        int multiplier = input.nextInt();

        System.out.println("Enter multiple: ");
        int multiple = input.nextInt();

        for (int i = 1; i <= multiple; i++) {
            product = product + multiplier;
        }
        System.out.println(product);
    }
}
