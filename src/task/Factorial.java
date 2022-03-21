package task;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.print(fact);
    }
}
